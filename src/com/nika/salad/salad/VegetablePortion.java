package com.nika.salad.salad;

import com.nika.salad.vegetable.Vegetable;

import java.io.Serializable;

/**
 * Created by nika.shkuratova on 04.03.2017.
 */
public class VegetablePortion implements Serializable {
    private final Vegetable vegetable;
    private final double weight;

    public VegetablePortion(Vegetable vegetable, double weight) {
        this.vegetable = vegetable;
        this.weight = weight;
    }

    public Vegetable getVegetable() {
        return vegetable;
    }

    public double getWeight() {
        return weight;
    }
}
