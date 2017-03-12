package com.nika.salad.vegetable;

/**
 * Created by nika.shkuratova on 04.03.2017.
 */
public abstract class Vegetable {

    private final double calories;
    private final double carbohydrates;
    private final double proteins;
    private Vitamins[] vitamins;

    public Vegetable(double calories, double carbohydrates, double proteins, Vitamins[] vitamins) {
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
