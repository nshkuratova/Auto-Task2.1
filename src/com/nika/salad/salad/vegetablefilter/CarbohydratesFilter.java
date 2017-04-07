package com.nika.salad.salad.vegetablefilter;

import com.nika.salad.salad.VegetableFinder;
import com.nika.salad.salad.VegetablePortion;

/**
 * CarbohydratesFilter is a subclass of a BaseFilterClass which is used to filter carbohydrates
 *
 * @see BaseFilterClass
 */
public class CarbohydratesFilter extends BaseFilterClass {

    /**
     * Constructor with parameters to create an object of CarbohydratesFilter class.
     *
     * @param minCarbohydrates search parameter defining minimum number of carbohydrates in the search range
     * @param maxCarbohydrate  search parameter defining maximum number of carbohydrates in the search range
     */
    public CarbohydratesFilter(double minCarbohydrates, double maxCarbohydrate) {
        super(minCarbohydrates, maxCarbohydrate);
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
        return vegetablePortion.getVegetable().getCarbohydrates() >= min && vegetablePortion.getVegetable().getCarbohydrates() <= max;
    }
}