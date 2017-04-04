package com.nika.salad.salad.vegetablefilter;

import com.nika.salad.salad.VegetableFinder;
import com.nika.salad.salad.VegetablePortion;
import com.nika.salad.vegetable.Vitamins;

/**
 * VitaminsFilter is a class which implements VegetableFinder.VegetableFilter interface to search vitamins in vegetable portions according to the search criteria
 * @see VegetableFinder.VegetableFilter
 */
public class VitaminsFilter implements VegetableFinder.VegetableFilter {
    private final Vitamins[] vitamins;

    /**
     * Constructor with parameters to create an object of VitaminsFilter class.
     * @param vitamins an array of vitamins defined from user's search string
     */
    public VitaminsFilter(Vitamins[] vitamins) {
        this.vitamins = vitamins;
    }

    /**
     * Overridden method of VegetableFinder.VegetableFilter interface used to find out if vegetable portion matches the search criteria.
     * Each vegetable portion is checked against an array of vitamins defined by user in a search string.
     * If all the vitamins from the search are present in current vegetable portion, method returns true.
     * In all other cases - false.
     * @param vegetablePortion a single object of VegetablePortion from the Salad
     * @return true if vegetable portion matches the search criteria, false - if doesn't
     * @see VegetableFinder.VegetableFilter
     */
    @Override
    public boolean isAccepted(VegetablePortion vegetablePortion) {
        for (int i = 0; i < vitamins.length; i++) {
            if (!hasVitamin(vegetablePortion.getVegetable().getVitamins(), vitamins[i])) {
                return false;
            }
        }
        return true;
    }

    /**
     * Method used to check if vitamins from the search criteria match vitamins in the vegetable portion.
     * If all the vitamins from the search are present in current vegetable portion (match vitamins from the vegetable portion), method returns true.
     * In all other cases - false.
     * @param vitamins vitamins which are present in current vegetable portion
     * @param searchedVitamin vitamins which user has entered in a search string
     * @return
     */
    private boolean hasVitamin(Vitamins[] vitamins, Vitamins searchedVitamin) {
        for (Vitamins v : vitamins) {
            if (searchedVitamin == v) {
                return true;
            }
        }
        return false;
    }
}