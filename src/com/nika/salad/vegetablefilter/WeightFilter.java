package com.nika.salad.vegetablefilter;

import com.nika.salad.salad.VegetableFinder;
import com.nika.salad.salad.VegetablePortion;

/**
 * Created by nika.shkuratova on 04.03.2017.
 */
public class WeightFilter implements VegetableFinder.VegetableFilter {
    private final double minWeigh;
    private final double maxWeight;

    public WeightFilter(double minWeigh, double maxWeight) {
        this.minWeigh = minWeigh;
        this.maxWeight = maxWeight;
    }

    @Override
    public boolean isAccepted(VegetablePortion vegetablePortion) {
        return vegetablePortion.getWeight() >= minWeigh && vegetablePortion.getWeight() <= maxWeight;
    }
}
