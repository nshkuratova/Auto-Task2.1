package com.nika.salad.vegetablefilter;

import com.nika.salad.salad.VegetableFinder;
import com.nika.salad.salad.VegetablePortion;

/**
 * Created by nika.shkuratova on 04.03.2017.
 */
public class WeightFilter extends BaseFilterClass implements VegetableFinder.VegetableFilter {

    public WeightFilter(double minWeigh, double maxWeight) {
        super(minWeigh, maxWeight);
    }

    @Override
    public boolean isAccepted(VegetablePortion vegetablePortion) {
        return vegetablePortion.getWeight() >= min&& vegetablePortion.getWeight() <= max;
    }
}
