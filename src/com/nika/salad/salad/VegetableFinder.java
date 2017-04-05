package com.nika.salad.salad;

import com.nika.salad.vegetable.Vegetable;

import java.util.ArrayList;
import java.util.Collection;

/**
 * VegetableFinder is a class used to search vegetables by different parameters.
 */
public class VegetableFinder {
    private final Salad salad;

    /**
     * Constructor with a parameter used to create an object of VegetableFinder class.
     * @param salad an object of salad in which the search will be conducted
     */
    public VegetableFinder(Salad salad) {
        if (salad == null) {
            throw new NullPointerException("Salad is null!");
        }
        this.salad = salad;
    }

    /**
     * Method used to search vegetables according to different search criteria (which are passed as a collection of VegetableFilters).
     * @param vegetableFilters a collection of search criteria against which the search will be invoked
     * @return a collection of vegetables which match the search results
     */
    public Collection<Vegetable> findVegetables(Collection<VegetableFilter> vegetableFilters) {
        if (vegetableFilters == null) {
            throw new NullPointerException("No search parameters are chosen.");
        }

        Collection<Vegetable> vegetableCollection = new ArrayList<>();

        boolean flag;

        for (VegetablePortion vegetablePortion : salad.getVegetablePortions()) {
            flag = true;
            for (VegetableFilter vegetableFilter : vegetableFilters) {
                if (!vegetableFilter.isAccepted(vegetablePortion)) {
                    flag = false;
                }
            }
            if (flag) {
                vegetableCollection.add(vegetablePortion.getVegetable());
            }
        }
        return vegetableCollection;
    }

    /**
     * VegetableFilter is an interface which declares a method used to find out if vegetable portion matches the search criteria
     */
    public interface VegetableFilter {
        boolean isAccepted(VegetablePortion vegetablePortion);
    }
}
