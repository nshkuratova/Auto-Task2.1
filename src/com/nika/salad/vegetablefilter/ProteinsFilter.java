package com.nika.salad.vegetablefilter;

import com.nika.salad.salad.VegetableFinder;
import com.nika.salad.salad.VegetablePortion;

/**
 * Created by nika.shkuratova on 13.03.2017.
 */
public class ProteinsFilter extends BaseFilterClass {

    public ProteinsFilter(double minProteins, double maxProteins) {
        super(minProteins, maxProteins);
    }

    @Override
    public boolean isAccepted(VegetablePortion vegetablePortion) {
        return vegetablePortion.getVegetable().getProteins() >= min && vegetablePortion.getVegetable().getProteins() <= max;
    }
}