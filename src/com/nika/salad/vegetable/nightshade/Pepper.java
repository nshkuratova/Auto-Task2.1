package com.nika.salad.vegetable.nightshade;

import com.nika.salad.vegetable.Vitamins;

/**
 * Subclass of Nightshade
 */
public class Pepper extends Nightshade {
    /**
     * Constructor without parameters used to create an object
     */
    public Pepper() {
        super(0.27, 5.3, 1.3, new Vitamins[]{Vitamins.E, Vitamins.B3, Vitamins.B5, Vitamins.B6, Vitamins.A}, "white");
    }

    /**
     * Returns a custom string representation of the object.
     *
     * @return a custom string representation of the object
     */
    @Override
    public String toString() {
        return "Pepper";
    }
}
