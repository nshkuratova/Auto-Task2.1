package com.nika.salad.salad.dao;

import com.nika.salad.exceptions.WrongIngredientException;
import com.nika.salad.salad.Salad;
import com.nika.salad.salad.VegetablePortion;
import com.nika.salad.vegetable.Vegetable;
import com.nika.salad.vegetable.cabbage.Broccoli;
import com.nika.salad.vegetable.cabbage.Brussels;
import com.nika.salad.vegetable.cabbage.Kale;
import com.nika.salad.vegetable.nightshade.Pepper;
import com.nika.salad.vegetable.nightshade.Tomato;
import com.nika.salad.vegetable.rootcrop.Beet;
import com.nika.salad.vegetable.rootcrop.Carrot;
import com.nika.salad.vegetable.rootcrop.Radish;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

/**
 * Created by nika.shkuratova on 28.03.2017.
 */
public class JsonDAO implements SaladDAO {

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
            try {
                switch (name.toLowerCase()) {
                    case "carrot":
                        vegetable = new Carrot();
                        break;
                    case "broccoli":
                        vegetable = new Broccoli();
                        break;
                    case "brussels":
                        vegetable = new Brussels();
                        break;
                    case "kale":
                        vegetable = new Kale();
                        break;
                    case "pepper":
                        vegetable = new Pepper();
                        break;
                    case "tomato":
                        vegetable = new Tomato();
                        break;
                    case "beet":
                        vegetable = new Beet();
                        break;
                    case "radish":
                        vegetable = new Radish();
                        break;
                    default:
                        throw new WrongIngredientException("\nWrong ingredient");
                }

                VegetablePortion vegetablePortion = new VegetablePortion(vegetable, Double.parseDouble(weight));
                salad.addVegetable(vegetablePortion);
            } catch (WrongIngredientException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return salad;
    }

    public void saveSalad(Salad salad){}
}
