package com.nika.salad.salad.vegetablefilter;

import com.nika.salad.salad.VegetableFinder;

/**
 * BaseFilterClass is an abstract base class used to define common fields and method to check minimum and maximum values' validity.
 * The class implements VegetableFinder.VegetableFilter interface.
 *
 * @see VegetableFinder.VegetableFilter
 */
public abstract class BaseFilterClass implements VegetableFinder.VegetableFilter {

    protected final double min;
    protected final double max;

    /**
     * Method used to check if minimum and maximum values passed as parameters are valid
     *
     * @param min minimum value
     * @param max maximum value
     */
    public BaseFilterClass(double min, double max) {
        if (min > max) {
            throw new IllegalArgumentException("Min value can't be bigger than max value!");
        } else if (min < 0 || max < 0) {
            throw new IllegalArgumentException("Min or max values can't be negative!");
        }

        this.min = min;
        this.max = max;
    }

}
