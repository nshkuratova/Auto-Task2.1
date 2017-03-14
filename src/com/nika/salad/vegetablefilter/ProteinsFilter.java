package com.nika.salad.vegetablefilter;

import com.nika.salad.salad.VegetableFinder;
import com.nika.salad.salad.VegetablePortion;

/**
 * Created by nika.shkuratova on 13.03.2017.
 */
public class ProteinsFilter implements VegetableFinder.VegetableFilter {
    private final double minProteins;
    private final double maxProteins;

    public ProteinsFilter(double minProteins, double maxProteins) {
        this.minProteins = minProteins;
        this.maxProteins = maxProteins;
    }

    @Override
    public boolean isAccepted(VegetablePortion vegetablePortion) {
        return vegetablePortion.getVegetable().getProteins() >= minProteins && vegetablePortion.getVegetable().getProteins() <= maxProteins;
    }
}