package com.nika.salad.vegetable;

import java.io.Serializable;

/**
 * Created by nika.shkuratova on 04.03.2017.
 */
public abstract class Vegetable implements Serializable {

    //calories in 1 gramm
    private final double calories;
    //carbohydrates in 1 gramm
    private final double carbohydrates;
    //proteins in 1 gramm
    private final double proteins;
    private final Vitamins[] vitamins;

    public Vegetable(double calories, double carbohydrates, double proteins, Vitamins[] vitamins) {
        if (calories < 0 || carbohydrates < 0 || proteins < 0) {
            throw new IllegalArgumentException("Attribute can't have negative value.");
        }
        this.calories = calories;
        this.carbohydrates = carbohydrates;
        this.proteins = proteins;
        this.vitamins = vitamins;
    }

    public double getCalories() {
        return calories;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public double getProteins() {
        return proteins;
    }

    public Vitamins[] getVitamins() {
        return vitamins;
    }
}
