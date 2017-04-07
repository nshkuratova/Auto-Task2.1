package com.nika.salad.vegetable.cabbage;

import com.nika.salad.vegetable.Vitamins;

/**
 * Subclass of Cabbage
 */
public class Broccoli extends Cabbage {
    /**
     * Constructor without parameters used to create an object
     */
    public Broccoli() {
        super(0.34, 7, 2.8, new Vitamins[]{Vitamins.B1, Vitamins.B2, Vitamins.B5, Vitamins.B6, Vitamins.E, Vitamins.A, Vitamins.C, Vitamins.K, Vitamins.PP}, 15.0);
    }

    /**
     * Returns a custom string representation of the object.
     *
     * @return a custom string representation of the object
     */
    @Override
    public String toString() {
        return "Broccoli";
    }
}
