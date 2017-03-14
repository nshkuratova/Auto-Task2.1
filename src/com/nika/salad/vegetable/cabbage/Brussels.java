package com.nika.salad.vegetable.cabbage;

import com.nika.salad.vegetable.Vitamins;

/**
 * Created by nika_shkuratava on 3/6/2017.
 */
public class Brussels extends Cabbage {

    public Brussels() {
        super(0.43, 9, 3.4, new Vitamins[]{Vitamins.B1, Vitamins.B2, Vitamins.B6, Vitamins.B9, Vitamins.C, Vitamins.A, Vitamins.K});
    }

    @Override
    public String toString() {
        return "Brussels";
    }
}
