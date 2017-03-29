package com.nika.salad.salad;

import com.nika.salad.vegetable.Vegetable;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by nika.shkuratova on 04.03.2017.
 */
public class SaladSorter {
    private Salad salad;

    public SaladSorter(Salad salad) {
        if (salad == null) {
            throw new NullPointerException("Salad is null!");
        }
        this.salad = salad;
    }

    public List<Vegetable> sortBy(Comparator<Vegetable> vegetableComparator) {
        if (vegetableComparator == null) {
            throw new NullPointerException("Sorting parameter is not chosen.");
        }
        List<Vegetable> vegetables = salad.getVegetables();
        Collections.sort(vegetables, vegetableComparator);
        return vegetables;
    }

    public static class CaloriesComparator implements Comparator<Vegetable> {

        @Override
        public int compare(Vegetable o1, Vegetable o2) {
            if (o1.getCalories() > o2.getCalories()) {
                return -1;
            } else if (o1.getCalories() < o2.getCalories()) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    public static class ProteintComparator implements Comparator<Vegetable> {

        @Override
        public int compare(Vegetable o1, Vegetable o2) {
            if (o1.getProteins() > o2.getProteins()) {
                return -1;
            } else if (o1.getProteins() < o2.getProteins()) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    public static class CarbohydratesComparator implements Comparator<Vegetable> {

        @Override
        public int compare(Vegetable o1, Vegetable o2) {
            if (o1.getCarbohydrates() > o2.getCarbohydrates()) {
                return -1;
            } else if (o1.getCarbohydrates() < o2.getCarbohydrates()) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
