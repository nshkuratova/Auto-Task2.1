package com.nika.salad.vegetablefilter;

import com.nika.salad.salad.VegetableFinder;
import com.nika.salad.salad.VegetablePortion;

/**
 * Created by nika.shkuratova on 04.03.2017.
 */
public class WeightFilter implements VegetableFinder.VegetableFilter {
    private int weigh;

    @Override
    public boolean isAccepted(VegetablePortion vegetablePortion) {
        return false;
    }
}
