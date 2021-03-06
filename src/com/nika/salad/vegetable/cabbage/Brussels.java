package com.nika.salad.vegetable.cabbage;

import com.nika.salad.vegetable.Vitamins;

/**
 * Subclass of Cabbage
 */
public class Brussels extends Cabbage {
    /**
     * Constructor without parameters used to create an object
     */
    public Brussels() {
        super(0.43, 9, 3.4, new Vitamins[]{Vitamins.B1, Vitamins.B2, Vitamins.B6, Vitamins.B9, Vitamins.C, Vitamins.A, Vitamins.K}, 5.0);
    }

    /**
     * Returns a custom string representation of the object.
     *
     * @return a custom string representation of the object
     */
    @Override
    public String toString() {
        return "Brussels";
    }
}
