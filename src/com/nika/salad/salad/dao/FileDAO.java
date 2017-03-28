package com.nika.salad.salad.dao;

import com.nika.salad.salad.Salad;
import com.nika.salad.salad.VegetablePortion;
import com.nika.salad.vegetable.rootcrop.Carrot;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by nika.shkuratova on 28.03.2017.
 */
public class FileDAO implements SaladDAO {

    public void saveSalad(Salad salad) {
    }

    public Salad readSalad() throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("D://salad.txt"));
        String s;
        String[] array;
        Salad salad = new Salad();

        while ((s = in.readLine()) != null) {
            array = s.split(":");
            VegetablePortion vegetablePortion = new VegetablePortion(new Carrot(), Double.valueOf(array[1]));
            salad.addVegetable(vegetablePortion);
        }

        return salad;
    }
}
