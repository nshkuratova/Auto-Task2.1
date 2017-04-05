package com.nika.salad.salad.vegetablefilter;

import com.nika.salad.salad.VegetableFinder;
import com.nika.salad.salad.VegetablePortion;

/**
 * CaloriesFilter is a subclass of a BaseFilterClass which is used to filter calories
 *
 * @see BaseFilterClass
 */
public class CaloriesFilter extends BaseFilterClass {

    /**
     * Constructor with parameters to create an object of CaloriesFilter class.
     *
     * @param minCalories search parameter defining minimum number of calories in the search range
     * @param maxCalories search parameter defining maximum number of calories in the search range
     */
    public CaloriesFilter(double minCalories, double maxCalories) {
        super(minCalories, maxCalories);
    }

    /**
     * Overridden method of VegetableFinder.VegetableFilter interface used to find out if vegetable portion matches the search criteria
     *
     * @param vegetablePortion a single object of VegetablePortion from the Salad
     * @return true if vegetable portion matches the search criteria, false - if doesn't
     * @see VegetableFinder.VegetableFilter
     */
    @Override
    public boolean isAccepted(VegetablePortion vegetablePortion) {
        return vegetablePortion.getVegetable().getCalories() >= min && vegetablePortion.getVegetable().getCalories() <= max;
    }
}