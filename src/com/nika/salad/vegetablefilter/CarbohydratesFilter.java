package com.nika.salad.vegetablefilter;

import com.nika.salad.salad.VegetableFinder;
import com.nika.salad.salad.VegetablePortion;

/**
 * Created by nika.shkuratova on 13.03.2017.
 */
public class CarbohydratesFilter implements VegetableFinder.VegetableFilter {
    private final double minCarbohydrates;
    private final double maxCarbohydrate;

    public CarbohydratesFilter(double minCarbohydrates, double maxCarbohydrate) {
        this.minCarbohydrates = minCarbohydrates;
        this.maxCarbohydrate = maxCarbohydrate;
    }

    @Override
    public boolean isAccepted(VegetablePortion vegetablePortion) {
        return vegetablePortion.getVegetable().getCarbohydrates() >= minCarbohydrates && vegetablePortion.getWeight() <= maxCarbohydrate;
    }
}