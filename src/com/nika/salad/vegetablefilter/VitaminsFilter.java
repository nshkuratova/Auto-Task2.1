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
        for (int i = 0; i < vitamins.length; i++) {
            if (!hasVitamin(vegetablePortion.getVegetable().getVitamins(), vitamins[i])) {
                return false;
            }
        }
        return true;
    }


    private boolean hasVitamin(Vitamins[] vitamins, Vitamins searchedVitamin) {
        for (Vitamins v : vitamins) {
            if (searchedVitamin == v) {
                return true;
            }
        }
        return false;
    }
}