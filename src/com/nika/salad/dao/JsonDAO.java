package com.nika.salad.dao;

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
 * Created by nika.shkuratova on 28.03.2017.
 */
public class JsonDAO extends BaseDAO {

    //TODO Exceptions handling
    public Salad readSalad() throws IOException, ParseException {

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

    public void saveSalad(Salad salad) {
    }
}
