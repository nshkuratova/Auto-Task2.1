package com.nika.salad.vegetablefilter;

import com.nika.salad.salad.VegetableFinder;
import com.nika.salad.salad.VegetablePortion;

/**
 * Created by nika.shkuratova on 13.03.2017.
 */
public class CaloriesFilter implements VegetableFinder.VegetableFilter {
    private final double minCalories;
    private final double maxCalories;

    public CaloriesFilter(double minCalories, double maxCalories) {
        this.minCalories = minCalories;
        this.maxCalories = maxCalories;
    }

    @Override
    public boolean isAccepted(VegetablePortion vegetablePortion) {
        return vegetablePortion.getVegetable().getCalories() >= minCalories && vegetablePortion.getVegetable().getCalories() <= maxCalories;
    }
}