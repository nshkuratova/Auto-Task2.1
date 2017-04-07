package com.nika.salad.vegetable.rootcrop;

import com.nika.salad.vegetable.Vitamins;

/**
 * Subclass of RootCrop
 */
public class Beet extends RootCrop {
    /**
     * Constructor without parameters used to create an object
     */
    public Beet() {
        super(0.43, 8.8, 1.5, new Vitamins[]{Vitamins.A, Vitamins.B1, Vitamins.B2, Vitamins.B3, Vitamins.B5, Vitamins.B6, Vitamins.B9, Vitamins.C, Vitamins.E}, 4);
    }

    /**
     * Returns a custom string representation of the object.
     *
     * @return a custom string representation of the object
     */
    @Override
    public String toString() {
        return "Beet";
    }
}