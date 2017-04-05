package com.nika.salad.vegetable.cabbage;

import com.nika.salad.vegetable.Vitamins;

/**
 * Subclass of Cabbage
 */
public class Kale extends Cabbage {
    /**
     * Constructor without parameters used to create an object
     */
    public Kale() {
        super(0.25, 5, 1.9, new Vitamins[]{Vitamins.B1, Vitamins.B2, Vitamins.B9, Vitamins.E, Vitamins.C, Vitamins.PP}, 10.0);
    }

    /**
     * Returns a custom string representation of the object.
     *
     * @return a custom string representation of the object
     */
    @Override
    public String toString() {
        return "Kale";
    }
}
