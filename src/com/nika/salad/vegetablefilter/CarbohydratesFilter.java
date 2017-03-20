package com.nika.salad.vegetablefilter;

import com.nika.salad.salad.VegetableFinder;
import com.nika.salad.salad.VegetablePortion;

/**
 * Created by nika.shkuratova on 13.03.2017.
 */
public class CarbohydratesFilter extends BaseFilterClass implements VegetableFinder.VegetableFilter {

    public CarbohydratesFilter(double minCarbohydrates, double maxCarbohydrate) {
        super (minCarbohydrates, maxCarbohydrate);
    }

    @Override
    public boolean isAccepted(VegetablePortion vegetablePortion) {
        return vegetablePortion.getVegetable().getCarbohydrates() >= min && vegetablePortion.getVegetable().getCarbohydrates() <= max;
    }
}