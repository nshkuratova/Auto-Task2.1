package com.nika.salad.salad;

import com.nika.salad.vegetable.Vegetable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nika.shkuratova on 04.03.2017.
 */
public class Salad {
    private List<VegetablePortion> list = new ArrayList<>();

    private String name;

    public void addVegetable(VegetablePortion vegetablePortion) {
        if (vegetablePortion == null) {
            throw new NullPointerException("Empty vegetable portion");
        }
        list.add(vegetablePortion);
    }

    public void mixSalad() {
        System.out.println("\nSalad is ready.");
    }

    public double countCalories() {
        double count = 0;

        for (VegetablePortion vegetablePortion : list) {
            count += vegetablePortion.getVegetable().getCalories() * vegetablePortion.getWeight();
        }

        return count;
    }

    public List<Vegetable> getVegetables() {
        ArrayList<Vegetable> vegetables = new ArrayList<>();
        for (VegetablePortion vegetablePortion : list) {
            vegetables.add(vegetablePortion.getVegetable());
        }
        return vegetables;
    }

    public List<VegetablePortion> getVegetablePortions() {
        return new ArrayList(list);
    }

}