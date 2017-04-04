package com.nika.salad.salad.vegetablefilter;

import com.nika.salad.salad.VegetableFinder;
import com.nika.salad.salad.VegetablePortion;

/**
 * WeightFilter is a subclass of a BaseFilterClass which is used to filter by weight
 * @see BaseFilterClass
 */
public class WeightFilter extends BaseFilterClass {

    /**
     * Constructor with parameters to create an object of WeightFilter class.
     * @param minWeigh search parameter defining minimum weight in the search range
     * @param maxWeight search parameter defining maximum weight in the search range
     */
    public WeightFilter(double minWeigh, double maxWeight) {
        super(minWeigh, maxWeight);
    }

    /**
     * Overridden method of VegetableFinder.VegetableFilter interface used to find out if vegetable portion matches the search criteria
     * @param vegetablePortion a single object of VegetablePortion from the Salad
     * @return true if vegetable portion matches the search criteria, false - if doesn't
     * @see VegetableFinder.VegetableFilter
     */
    @Override
    public boolean isAccepted(VegetablePortion vegetablePortion) {
        return vegetablePortion.getWeight() >= min && vegetablePortion.getWeight() <= max;
    }
}
