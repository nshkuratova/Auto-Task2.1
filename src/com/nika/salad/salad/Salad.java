package com.nika.salad.salad;

import com.nika.salad.vegetable.Vegetable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Salad is a class designed to store information about the list of ingredients (vegetable portions which consists of vegetables and their weight).
 * The class provides methods to add ingredients to a salad, to mix the ingredients in the salad,
 * to count calories of the salad and to return a list of vegetables (or vegetable portions) which are contained in a particular salad.
 *
 * @see VegetablePortion
 */
public class Salad {
    private List<VegetablePortion> list = new ArrayList<>();

    private String name;

    /**
     * Method used to add a vegetable portion to a salad which consists of a vegetable and its weight.
     *
     * @param vegetablePortion vegetable portion which consists of a vegetable and its weight which comes from console (entered by user) or from external source
     * @throws NullPointerException if empty vegetable portion is passed to the method
     */
    public void addVegetable(VegetablePortion vegetablePortion) throws NullPointerException {
        if (vegetablePortion == null) {
            throw new NullPointerException("Empty vegetable portion");
        }
        list.add(vegetablePortion);
    }

    /**
     * Method used to mix vegetables in a salad.
     */
    public void mixSalad() {
        Collections.shuffle(list);
        System.out.println("\nSalad is ready.");
    }

    /**
     * Method used to count calories in a salad.
     *
     * @return the number of calories in the salad
     */
    public double countCalories() {
        double count = 0;

        for (VegetablePortion vegetablePortion : list) {
            count += vegetablePortion.getVegetable().getCalories() * vegetablePortion.getWeight();
        }

        return count;
    }

    /**
     * Method used to return a list of vegetables which are contained in the salad.
     *
     * @return a list of vegetables which are contained in the salad.
     */
    public List<Vegetable> getVegetables() {
        ArrayList<Vegetable> vegetables = new ArrayList<>();
        for (VegetablePortion vegetablePortion : list) {
            vegetables.add(vegetablePortion.getVegetable());
        }
        return vegetables;
    }

    /**
     * Method used to return a copy of a list of vegetable portions which are contained in a salad.
     *
     * @return a copy of a list of vegetable portions which are contained in a salad.
     */
    public List<VegetablePortion> getVegetablePortions() {
        return new ArrayList(list);
    }

}