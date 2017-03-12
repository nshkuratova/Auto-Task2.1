package com.nika.salad.vegetable.rootcrop;

import com.nika.salad.vegetable.Vegetable;
import com.nika.salad.vegetable.Vitamins;

/**
 * Created by nika.shkuratova on 04.03.2017.
 */
public abstract class RootCrop extends Vegetable {

    public RootCrop(int calories, double carbohydrates, double proteins, Vitamins [] vitamins) {
        super(calories, carbohydrates, proteins, vitamins);
    }
}
