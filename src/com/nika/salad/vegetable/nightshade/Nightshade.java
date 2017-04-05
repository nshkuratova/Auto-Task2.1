package com.nika.salad.vegetable.nightshade;

import com.nika.salad.vegetable.Vegetable;
import com.nika.salad.vegetable.Vitamins;

/**
 * Nightshade is an abstract class which is a subclass of a Vegetable class.
 * The class is used to describe an abstract subculture of a Vegetable.
 *
 * @see Vegetable
 */
public abstract class Nightshade extends Vegetable {
    //color of flowers of Nightshade class of Vegetables
    private final String colorofFlowers;

    /**
     * Constructor with parameters
     *
     * @param calories       number of calories in 100g
     * @param carbohydrates  number of carbohydrates in 100g
     * @param proteins       number of proteins in 100g
     * @param vitamins       list of vitamins
     * @param colorofFlowers color of flowers
     */
    public Nightshade(double calories, double carbohydrates, double proteins, Vitamins[] vitamins, String colorofFlowers) {
        super(calories, carbohydrates, proteins, vitamins);
        this.colorofFlowers = colorofFlowers;
    }
}
