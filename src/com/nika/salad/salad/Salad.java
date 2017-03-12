package com.nika.salad.salad;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nika.shkuratova on 04.03.2017.
 */
public class Salad {
    private List<VegetablePortion> list = new ArrayList<>();

    public void addVegetable(VegetablePortion vegetablePortion) {
        list.add(vegetablePortion);
    }

    public void mixSalad() {
        System.out.println("Salad is ready.");
    }

    public double countCalories() {
        double count = 0;

        for (VegetablePortion vegetablePortion : list) {
            count += vegetablePortion.getVegetable().getCalories() * vegetablePortion.getWeight();
        }

        return count;
    }
}