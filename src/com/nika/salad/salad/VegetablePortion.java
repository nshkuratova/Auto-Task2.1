package com.nika.salad.salad;

import com.nika.salad.vegetable.Vegetable;

/**
 * Created by nika.shkuratova on 04.03.2017.
 */
public class VegetablePortion {
    private final Vegetable vegetable;
    private final double weight;

    public VegetablePortion(Vegetable vegetable, double weight) {
        this.vegetable = vegetable;
        this.weight = weight;
        //count of vitamins depends on weight
    }

    public Vegetable getVegetable() {
        return vegetable;
    }

    public double getWeight() {
        return weight;
    }
}
