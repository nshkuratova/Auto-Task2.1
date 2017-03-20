package com.nika.salad.vegetablefilter;

import com.nika.salad.salad.VegetableFinder;
import com.nika.salad.salad.VegetablePortion;

/**
 * Created by nika.shkuratova on 13.03.2017.
 */
public class CaloriesFilter extends BaseFilterClass {

    public CaloriesFilter(double minCalories, double maxCalories) {
        super(minCalories, maxCalories);
    }

    @Override
    public boolean isAccepted(VegetablePortion vegetablePortion) {
        return vegetablePortion.getVegetable().getCalories() >= min && vegetablePortion.getVegetable().getCalories() <= max;
    }
}