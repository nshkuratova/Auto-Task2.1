package com.nika.salad.vegetable.rootcrop;

import com.nika.salad.vegetable.Vitamins;

/**
 * Subclass of RootCrop
 */
public class Carrot extends RootCrop {
    /**
     * Constructor without parameters used to create an object
     */
    public Carrot() {
        super(0.32, 6.9, 1.3, new Vitamins[]{Vitamins.A, Vitamins.B1, Vitamins.B2, Vitamins.B3, Vitamins.B6, Vitamins.B9, Vitamins.C, Vitamins.E, Vitamins.H, Vitamins.K}, 3);
    }

    /**
     * Returns a custom string representation of the object.
     *
     * @return a custom string representation of the object
     */
    @Override
    public String toString() {
        return "Carrot";
    }
}
