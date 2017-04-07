package com.nika.salad.salad.vegetablefilter;

import com.nika.salad.salad.VegetableFinder;
import com.nika.salad.salad.VegetablePortion;

/**
 * ProteinsFilter is a subclass of a BaseFilterClass which is used to filter proteins
 *
 * @see BaseFilterClass
 */
public class ProteinsFilter extends BaseFilterClass {

    /**
     * Constructor with parameters to create an object of ProteinsFilter class.
     *
     * @param minProteins search parameter defining minimum number of proteins in the search range
     * @param maxProteins search parameter defining maximum number of proteins in the search range
     */
    public ProteinsFilter(double minProteins, double maxProteins) {
        super(minProteins, maxProteins);
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
        return vegetablePortion.getVegetable().getProteins() >= min && vegetablePortion.getVegetable().getProteins() <= max;
    }
}