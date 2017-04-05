package com.nika.salad.vegetable.cabbage;

import com.nika.salad.vegetable.Vegetable;
import com.nika.salad.vegetable.Vitamins;

/**
 * Cabbage is an abstract class which is a subclass of a Vegetable class.
 * The class is used to describe an abstract subculture of a Vegetable.
 *
 * @see Vegetable
 */
public abstract class Cabbage extends Vegetable {

    //diameter of a cabbage vegetable in centimeters
    private final double diameter;

    /**
     * Constructor with parameters
     *
     * @param calories      number of calories in 1g
     * @param carbohydrates number of carbohydrates in 1g
     * @param proteins      number of proteins in 1g
     * @param vitamins      list of vitamins
     * @param diameter      diameter of the vegetable
     * @throws IllegalArgumentException if invalid diameter parameter was passed
     */
    public Cabbage(double calories, double carbohydrates, double proteins, Vitamins[] vitamins, double diameter) throws IllegalArgumentException {
        super(calories, carbohydrates, proteins, vitamins);
        if (diameter <= 0) {
            throw new IllegalArgumentException("Diameter can't be less or equal to zero!");
        }
        this.diameter = diameter;
    }
}
