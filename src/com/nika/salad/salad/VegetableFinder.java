package com.nika.salad.salad;

import com.nika.salad.vegetable.Vegetable;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by nika.shkuratova on 04.03.2017.
 */
public class VegetableFinder {
    private final Salad salad;

    public VegetableFinder(Salad salad) {
        this.salad = salad;
    }

    public Collection<Vegetable> findVegetables(VegetableFilter vegetableFilter) {
        Collection<Vegetable> vegetableCollection = new ArrayList<>();
        /*if (vegetableFilter.isAccepted()) {

        }*/
        return null;
    }

    public interface VegetableFilter {

        boolean isAccepted(VegetablePortion vegetablePortion);
    }
}
