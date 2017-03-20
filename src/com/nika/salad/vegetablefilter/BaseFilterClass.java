package com.nika.salad.vegetablefilter;

import com.nika.salad.salad.VegetableFinder;

/**
 * Created by nika_shkuratava on 3/20/2017.
 */
public abstract class BaseFilterClass implements VegetableFinder.VegetableFilter {

    protected final double min;
    protected final double max;

    public BaseFilterClass(double min, double max) {
        if (min > max) {
            throw new IllegalArgumentException("Min value can't be bigger than max value!");
        }
        else if(min < 0 || max < 0){
            throw new IllegalArgumentException("Min or max values can't be negative!");
        }

        this.min = min;
        this.max = max;
    }

}
