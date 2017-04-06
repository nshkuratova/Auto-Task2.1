package com.nika.salad.dao;

import com.nika.salad.exceptions.WrongVegetableException;
import com.nika.salad.salad.Salad;
import com.nika.salad.salad.VegetablePortion;
import com.nika.salad.vegetable.Vegetable;

import java.io.*;
import java.util.ArrayList;

/**
 * FileDAO class is used to work with files.
 * The main purpose of the class is to read data from a file and save data to a file.
 */
public class FileDAO extends BaseDAO {

    /**
     * Method is used to save data to a file.
     *
     * @param salad An instance of salad which will be saved to the external source (file)
     */
    public void saveSalad(Salad salad) throws IOException {
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
            if (out != null) {
                System.out.println("Closing PrintWriter");
                out.close();
            } else {
                System.out.println("PrintWriter not open");
            }
        }
    }

    /**
     * Method is used to retrieve data from the file and to return an instance of salad.
     *
     * @return an instance of salad (a list of vegetables and their weigh which are represented as vegetable portions)
     * @throws IOException             If an input or output exception occurred
     * @throws WrongVegetableException if non-existent vegetable name was passed from the external source (file)
     */
    public Salad readSalad() throws WrongVegetableException, IOException {
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
