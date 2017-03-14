package com.nika.salad.vegetablefilter;

import com.nika.salad.salad.VegetableFinder;
import com.nika.salad.salad.VegetablePortion;
import com.nika.salad.vegetable.Vitamins;

/**
 * Created by nika.shkuratova on 13.03.2017.
 */
public class VitaminsFilter implements VegetableFinder.VegetableFilter {
    private final Vitamins[] vitamins;

    public VitaminsFilter(Vitamins[] vitamins) {
        this.vitamins = vitamins;
    }

    @Override
    public boolean isAccepted(VegetablePortion vegetablePortion) {
        int count = 0;
        for (int i = 0; i < vitamins.length; i++) {
            for (Vitamins v : vegetablePortion.getVegetable().getVitamins()) {
                if (vitamins[i].equals((v))) {
                    count++;
                }
            }
        }

        if (count == vitamins.length) {
            return true;
        } else return false;
    }
}
