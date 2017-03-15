package com.nika.salad.vegetable.rootcrop;

import com.nika.salad.vegetable.Vitamins;

/**
 * Created by nika.shkuratova on 04.03.2017.
 */
public class Carrot extends RootCrop {

    public Carrot() {
        super(0.32, 6.9, 1.3, new Vitamins[]{Vitamins.A, Vitamins.B1, Vitamins.B2, Vitamins.B3, Vitamins.B6, Vitamins.B9, Vitamins.C, Vitamins.E, Vitamins.H, Vitamins.K}, 3);
    }

    @Override
    public String toString() {
        return "Carrot";
    }
}
