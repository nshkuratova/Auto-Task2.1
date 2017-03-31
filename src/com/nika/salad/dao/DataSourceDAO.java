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
 * Created by nika_shkuratava on 3/31/2017.
 */
public abstract class DataSourceDAO {

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
