package com.nika.salad.vegetable.rootcrop;

import com.nika.salad.vegetable.Vitamins;

/**
 * Subclass of RootCrop
 */
public class Radish extends RootCrop {
    /**
     * Constructor without parameters used to create an object
     */
    public Radish() {
        super(0.19, 3.4, 1.2, new Vitamins[]{Vitamins.C, Vitamins.B1, Vitamins.B2, Vitamins.E, Vitamins.B3, Vitamins.B5, Vitamins.B6, Vitamins.B9}, 7);
    }
    /**
     * Returns a custom string representation of the object.
     *
     * @return a custom string representation of the object
     */
    @Override
    public String toString() {
        return "Radish";
    }
}
