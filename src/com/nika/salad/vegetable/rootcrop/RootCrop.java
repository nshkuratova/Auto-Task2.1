package com.nika.salad.vegetable.rootcrop;

import com.nika.salad.vegetable.Vegetable;
import com.nika.salad.vegetable.Vitamins;

/**
 * RootCrop is an abstract class which is a subclass of a Vegetable class.
 * The class is used to describe an abstract subculture of a Vegetable.
 *
 * @see Vegetable
 */
public abstract class RootCrop extends Vegetable {

    //the length of rootcrop part of the vegetable. Measured in cenrimeters.
    private final double lengthofRootcropPart;

    /**
     * Constructor with parameters
     *
     * @param calories      number of calories in 100g
     * @param carbohydrates number of carbohydrates in 100g
     * @param proteins      number of proteins in 100g
     * @param vitamins      list of vitamins
     * @param lengthofRootcropPart      the length of rootcrop part of the vegetable
     * @throws IllegalArgumentException if invalid length parameter was passed
     */
    public RootCrop(double calories, double carbohydrates, double proteins, Vitamins[] vitamins, double lengthofRootcropPart) {
        super(calories, carbohydrates, proteins, vitamins);
        if (lengthofRootcropPart <= 0) {
            throw new IllegalArgumentException("The length can't be zero or negative!");
        }
        this.lengthofRootcropPart = lengthofRootcropPart;
    }
}
