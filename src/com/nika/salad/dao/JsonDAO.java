package com.nika.salad.dao;

import com.nika.salad.exceptions.WrongVegetableException;
import com.nika.salad.salad.Salad;
import com.nika.salad.salad.VegetablePortion;
import com.nika.salad.vegetable.Vegetable;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

/**
 * JsonDAO class is used to work with JSON.
 * The main purpose of the class is to read data from json and save data in json.
 */
public class JsonDAO extends BaseDAO {

    /**
     * Method is used to retrieve data from json and to return an instance of salad.
     *
     * @return an instance of salad (a list of vegetables and their weigh which are represented as vegetable portions)
     * @throws IOException             If an input or output exception occurred
     * @throws ParseException          If an error while parsing json has occurred
     * @throws WrongVegetableException if non-existent vegetable name was passed from the external source (json)
     */
    public Salad readSalad() throws IOException, ParseException, WrongVegetableException {

        Salad salad = new Salad();

        JSONParser parser = new JSONParser();
        JSONArray array = (JSONArray) parser.parse(new FileReader("./resources/salad.json"));

        for (Object obj : array) {
            JSONObject json_veg = (JSONObject) obj;
            Vegetable vegetable;
            String name = (String) json_veg.get("Name");
            String weight = (String) json_veg.get("Weight");

            vegetable = this.createVegetableByName(name);
            if (vegetable != null) {
                VegetablePortion vegetablePortion = new VegetablePortion(vegetable, Double.parseDouble(weight));
                salad.addVegetable(vegetablePortion);
            }
        }
        return salad;
    }

    /**
     * This method is to be implemented later.
     *
     * @param salad An instance of salad which will be saved to the external source (json).
     */
    public void saveSalad(Salad salad) {
    }
}
