package com.nika.salad.vegetable.cabbage;

import com.nika.salad.vegetable.Vitamins;

/**
 * Created by nika_shkuratava on 3/6/2017.
 */
public class Kale extends Cabbage {

    public Kale() {
        super(0.25, 5, 1.9, new Vitamins[]{Vitamins.B1, Vitamins.B2, Vitamins.B9, Vitamins.E, Vitamins.C, Vitamins.PP});
    }

    @Override
    public String toString() {
        return "Kale";
    }
}
