package com.nika.salad.dao;

import com.nika.salad.salad.Salad;
import com.nika.salad.salad.VegetablePortion;
import com.nika.salad.vegetable.Vegetable;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by nika.shkuratova on 28.03.2017.
 */
public class FileDAO extends DataSourceDAO implements SaladDAO {

    public void saveSalad(Salad salad) {
        try {
            PrintWriter out = new PrintWriter(new File("./resources/salad.txt"));

            String saladToString = "";

            ArrayList<VegetablePortion> vegPortionsList = new ArrayList<>(salad.getVegetablePortions());

            for (int i = 0; i < vegPortionsList.size(); i++) {
                saladToString += vegPortionsList.get(i).getVegetable().toString() + ": " + vegPortionsList.get(i).getWeight();
                if (i != vegPortionsList.size() - 1) saladToString += "\r\n";
            }

            try {
                out.print(saladToString);
            } finally {
                out.close();
            }
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }

    public Salad readSalad() throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("./resources/salad.txt"));
        String s;
        String[] array;
        Salad salad = new Salad();

        while ((s = in.readLine()) != null) {
            array = s.split(":");
            Vegetable vegetable;

            vegetable = this.createVegetableByName(array[0]);
            if (vegetable != null) {
                VegetablePortion vegetablePortion = new VegetablePortion(vegetable, Double.parseDouble(array[1]));
                salad.addVegetable(vegetablePortion);
            }
        }
        in.close();

        return salad;
    }
}
