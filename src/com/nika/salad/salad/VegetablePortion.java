package com.nika.salad.salad;

import com.nika.salad.vegetable.Vegetable;

/**
 * VegetablePortion is a class used to describe a salad ingredient which contains of a certain vegetable and its weight.
 */
public class VegetablePortion {
    private final Vegetable vegetable;
    private final double weight;

    /**
     * Constructor with parameters which is used to craete an object of VegetablePortion
     * @param vegetable an object of Vegetable which can be either received from console or from external source
     * @param weight weight of a certain vegetable which can be either received from console or from external source
     */
    public VegetablePortion(Vegetable vegetable, double weight) {
        this.vegetable = vegetable;
        this.weight = weight;
    }

    /**
     * Getter method used to return an object of vegetable
     * @return vegetable object
     */
    public Vegetable getVegetable() {
        return vegetable;
    }

    /**
     * Getter method used to return weight of a vegetable
     * @return weight of the vegetable
     */
    public double getWeight() {
        return weight;
    }
}
