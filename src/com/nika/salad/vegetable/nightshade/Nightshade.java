package com.nika.salad.vegetable.nightshade;

import com.nika.salad.vegetable.Vegetable;
import com.nika.salad.vegetable.Vitamins;

/**
 * Created by nika_shkuratava on 3/6/2017.
 */
public class Nightshade extends Vegetable {
    //color of flowers of Nightshade class of Vegetables
    private String colorofFlowers;

    public Nightshade(double calories, double carbohydrates, double proteins, Vitamins[] vitamins, String colorofFlowers) {
        super(calories, carbohydrates, proteins, vitamins);
        this.colorofFlowers = colorofFlowers;
    }
}
