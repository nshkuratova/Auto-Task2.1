package com.nika.salad.vegetable.nightshade;

import com.nika.salad.vegetable.Vitamins;

/**
 * Created by nika_shkuratava on 3/6/2017.
 */
public class Pepper extends Nightshade {

    public Pepper() {
        super(0.27, 5.3, 1.3, new Vitamins[]{Vitamins.E, Vitamins.B3, Vitamins.B5, Vitamins.B6, Vitamins.A}, "white");
    }

    @Override
    public String toString() {
        return "Pepper";
    }
}
