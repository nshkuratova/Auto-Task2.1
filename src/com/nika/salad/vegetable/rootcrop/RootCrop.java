package com.nika.salad.vegetable.rootcrop;

import com.nika.salad.vegetable.Vegetable;
import com.nika.salad.vegetable.Vitamins;

/**
 * Created by nika.shkuratova on 04.03.2017.
 */
public abstract class RootCrop extends Vegetable {

    //the length of rootcrop part of the vegetable. Measured in santimeters.
    private final double lengthofRootcropPart;

    public RootCrop(double calories, double carbohydrates, double proteins, Vitamins[] vitamins, double lengthofRootcropPart) {
        super(calories, carbohydrates, proteins, vitamins);
        if (lengthofRootcropPart <= 0){
            throw new IllegalArgumentException("The length can't be zero or negative!");
        }
        this.lengthofRootcropPart = lengthofRootcropPart;
    }
}
