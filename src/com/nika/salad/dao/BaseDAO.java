package com.nika.salad.dao;

import com.nika.salad.exceptions.WrongIngredientException;
import com.nika.salad.vegetable.Vegetable;
import com.nika.salad.vegetable.cabbage.Broccoli;
import com.nika.salad.vegetable.cabbage.Brussels;
import com.nika.salad.vegetable.cabbage.Kale;
import com.nika.salad.vegetable.nightshade.Pepper;
import com.nika.salad.vegetable.nightshade.Tomato;
import com.nika.salad.vegetable.rootcrop.Beet;
import com.nika.salad.vegetable.rootcrop.Carrot;
import com.nika.salad.vegetable.rootcrop.Radish;


/**
 * BaseDAO is the abstract base class for all classes to work with external sources of data.
 * The class is implemeted to share the same method of creating a Vegetable sub-class object
 * depending on the string with the name of the vegetable which comes from the external source (file, json, database).
 * @author Nika Shkuratava
 */
public abstract class BaseDAO implements DataSourceDAO {

    /**
     * Creates an object of Vegetable sub-class depending on the string with the name of a vegetable which
     * comes from the external source (file, json, database).
     * @param name the name of the vegetable which comes from the external source
     * @return an object of the specified Vegetable
     */
    public Vegetable createVegetableByName(String name) {
        Vegetable vegetable = null;
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
        } catch (WrongIngredientException ex) {
            System.out.println(ex.getMessage());
        }
        return vegetable;
    }
}
