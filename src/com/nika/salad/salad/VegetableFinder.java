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

    public Collection<Vegetable> findVegetables(Collection<VegetableFilter> vegetableFilters) {
        Collection<Vegetable> vegetableCollection = new ArrayList<>();

        for (VegetablePortion vegetablePortion : salad.getVegetablePortions()) {
            int count = 0;
            for (VegetableFilter vegetableFilter : vegetableFilters) {
                if (vegetableFilter.isAccepted(vegetablePortion)) {
                    count++;
                } else {
                    break;
                }
                if (count == vegetableFilters.size()) {
                    vegetableCollection.add(vegetablePortion.getVegetable());
                }
            }
        }
        return vegetableCollection;
    }

    public interface VegetableFilter {
        boolean isAccepted(VegetablePortion vegetablePortion);
    }
}
