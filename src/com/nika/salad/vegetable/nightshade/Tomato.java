package com.nika.salad.vegetable.nightshade;

import com.nika.salad.vegetable.Vitamins;

/**
 * Created by nika_shkuratava on 3/6/2017.
 */
public class Tomato extends Nightshade {
    public Tomato() {
        super(0.20, 3.7, 1.1, new Vitamins[]{Vitamins.C, Vitamins.E, Vitamins.B3, Vitamins.B5, Vitamins.B6}, "yellow");
    }

    @Override
    public String toString() {
        return "Tomato";
    }
}
