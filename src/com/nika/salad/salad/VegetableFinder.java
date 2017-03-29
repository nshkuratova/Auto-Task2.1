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
        if (salad == null) {
            throw new NullPointerException("Salad is null!");
        }
        this.salad = salad;
    }

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

    public interface VegetableFilter {
        boolean isAccepted(VegetablePortion vegetablePortion);
    }
}
