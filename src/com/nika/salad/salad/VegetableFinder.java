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

        for (VegetablePortion vegetablePortion : salad.getVegetablePortions()) {
            for (VegetableFilter vegetableFilter : vegetableFilters) {
                if (!vegetableFilter.isAccepted(vegetablePortion)) {
                    return new ArrayList<>();
                }
            }
            vegetableCollection.add(vegetablePortion.getVegetable());
        }
        return vegetableCollection;
    }

    public interface VegetableFilter {
        boolean isAccepted(VegetablePortion vegetablePortion);
    }
}
