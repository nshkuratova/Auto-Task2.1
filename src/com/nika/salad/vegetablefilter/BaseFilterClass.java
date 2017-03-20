package com.nika.salad.vegetablefilter;

/**
 * Created by nika_shkuratava on 3/20/2017.
 */
public class BaseFilterClass {

    protected final double min;
    protected final double max;

    public BaseFilterClass(double min, double max) {
        if (min > max) {
            throw new IllegalArgumentException("Min value can't be bigger than max value");
        }
        this.min = min;
        this.max = max;
    }

}
