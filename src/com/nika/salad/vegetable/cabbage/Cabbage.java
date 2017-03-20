package com.nika.salad.vegetable.cabbage;

import com.nika.salad.vegetable.Vegetable;
import com.nika.salad.vegetable.Vitamins;

/**
 * Created by nika_shkuratava on 3/6/2017.
 */
public class Cabbage extends Vegetable {

    //diameter of a cabbage vegetable in santimeters
    private double diameter;

    public Cabbage(double calories, double carbohydrates, double proteins, Vitamins[] vitamins, double diameter) {
        super(calories, carbohydrates, proteins, vitamins);
        if (diameter <= 0){
            throw new IllegalArgumentException("Diameter can't be less or equal to zero!");
        }
        this.diameter = diameter;
    }
}
