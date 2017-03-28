package com.nika.salad.salad;

import com.nika.salad.vegetable.Vegetable;

import java.io.IOException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nika.shkuratova on 04.03.2017.
 */
public class Salad implements Serializable {
    private List<VegetablePortion> list = new ArrayList<>();

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

    private void writeObject(java.io.ObjectOutputStream stream) throws IOException{}

    private void readObject(java.io.ObjectInputStream stream) throws IOException, ClassNotFoundException {
        Vegetable vegetable = (Vegetable) stream.readObject();
        double weight = (double) stream.readDouble();
        VegetablePortion vegetablePortion = new VegetablePortion(vegetable, weight);
        this.addVegetable(vegetablePortion);
    }

    private void readObjectNoData() throws ObjectStreamException {}


    public List<VegetablePortion> getVegetablePortions() {
        return new ArrayList(list);
    }
}