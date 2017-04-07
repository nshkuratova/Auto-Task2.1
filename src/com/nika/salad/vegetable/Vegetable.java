package com.nika.salad.vegetable;

/**
 * An abstract class to represent a Vegetable culture
 */
public abstract class Vegetable {

    private final double calories;
    private final double carbohydrates;
    private final double proteins;
    private final Vitamins[] vitamins;

    /**
     * @param calories      number of calories in 1g
     * @param carbohydrates number of carbohydrates in 1g
     * @param proteins      number of proteins in 1g
     * @param vitamins      list of vitamins
     */
    public Vegetable(double calories, double carbohydrates, double proteins, Vitamins[] vitamins) {
        if (calories < 0 || carbohydrates < 0 || proteins < 0) {
            throw new IllegalArgumentException("Attribute can't have negative value.");
        }
        this.calories = calories;
        this.carbohydrates = carbohydrates;
        this.proteins = proteins;
        this.vitamins = vitamins;
    }

    /**
     * Getter to receive a number of calories
     *
     * @return number of calories
     */
    public double getCalories() {
        return calories;
    }

    /**
     * Getter to receive a number of carbohydrates
     *
     * @return number of carbohydrates
     */
    public double getCarbohydrates() {
        return carbohydrates;
    }

    /**
     * Getter to receive a number of proteins
     *
     * @return number of proteins
     */
    public double getProteins() {
        return proteins;
    }

    /**
     * Getter to receive a list of vitamins
     *
     * @return list of vitamins
     */
    public Vitamins[] getVitamins() {
        return vitamins;
    }
}
