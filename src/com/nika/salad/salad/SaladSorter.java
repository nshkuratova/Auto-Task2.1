package com.nika.salad.salad;

import com.nika.salad.vegetable.Vegetable;

import java.util.Collection;
import java.util.Comparator;

/**
 * Created by nika.shkuratova on 04.03.2017.
 */
public class SaladSorter {
    private Salad salad;

    public SaladSorter(Salad salad) {
        this.salad = salad;
    }

    public Collection<Vegetable> sortByCalories() {
        return null;
    }

    private class CaloriesComparator implements Comparator<Vegetable> {

        @Override
        public int compare(Vegetable o1, Vegetable o2) {
            return 0;
        }
    }
}
