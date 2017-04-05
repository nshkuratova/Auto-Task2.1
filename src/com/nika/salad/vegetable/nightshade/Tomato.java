package com.nika.salad.vegetable.nightshade;

import com.nika.salad.vegetable.Vitamins;

/**
 * Subclass of Nightshade
 */
public class Tomato extends Nightshade {
    /**
     * Constructor without parameters used to create an object
     */
    public Tomato() {
        super(0.20, 3.7, 1.1, new Vitamins[]{Vitamins.C, Vitamins.E, Vitamins.B3, Vitamins.B5, Vitamins.B6}, "yellow");
    }

    /**
     * Returns a custom string representation of the object.
     *
     * @return a custom string representation of the object
     */
    @Override
    public String toString() {
        return "Tomato";
    }
}
