package com.nika.salad.salad;

import com.nika.salad.vegetable.Vegetable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by nika.shkuratova on 04.03.2017.
 */
public class SaladSorter {
    private Salad salad;

    public SaladSorter(Salad salad) {
        this.salad = salad;
    }

    public List<Vegetable> sortBy(Comparator<Vegetable> vegetableComparator) {
        List<Vegetable> vegetables = new ArrayList<>();
        //vegetables.;
        Collections.sort(vegetables, vegetableComparator);
        return null;
    }

    public static class CaloriesComparator implements Comparator<Vegetable> {

        @Override
        public int compare(Vegetable o1, Vegetable o2) {
            return 0;
        }
    }

    public static class ProteintComparator implements Comparator<Vegetable> {

        @Override
        public int compare(Vegetable o1, Vegetable o2) {
            return 0;
        }
    }

    public static class CarbohydratesComparator implements Comparator<Vegetable> {

        @Override
        public int compare(Vegetable o1, Vegetable o2) {
            return 0;
        }
    }
}
