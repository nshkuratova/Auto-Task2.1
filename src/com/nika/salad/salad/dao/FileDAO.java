package com.nika.salad.salad.dao;

import com.nika.salad.exceptions.WrongIngredientException;
import com.nika.salad.salad.Salad;
import com.nika.salad.salad.VegetablePortion;
import com.nika.salad.vegetable.Vegetable;
import com.nika.salad.vegetable.cabbage.Broccoli;
import com.nika.salad.vegetable.cabbage.Brussels;
import com.nika.salad.vegetable.cabbage.Kale;
import com.nika.salad.vegetable.nightshade.Pepper;
import com.nika.salad.vegetable.nightshade.Tomato;
import com.nika.salad.vegetable.rootcrop.Beet;
import com.nika.salad.vegetable.rootcrop.Carrot;
import com.nika.salad.vegetable.rootcrop.Radish;

import java.io.*;

/**
 * Created by nika.shkuratova on 28.03.2017.
 */
public class FileDAO implements SaladDAO {

    public void saveSalad(Salad salad) {
        try {
            PrintWriter out = new PrintWriter(new File("d://salad.txt"));
            try {
                out.print(salad.toString());
            } finally {
                out.close();
            }
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }

    public Salad readSalad() throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("D://salad.txt"));
        String s;
        String[] array;
        Salad salad = new Salad();

        while ((s = in.readLine()) != null) {
            array = s.split(":");
            Vegetable vegetable;

            try {
                switch (array[0].toLowerCase()) {
                    case "carrot":
                        vegetable = new Carrot();
                        break;
                    case "broccoli":
                        vegetable = new Broccoli();
                        break;
                    case "brussels":
                        vegetable = new Brussels();
                        break;
                    case "kale":
                        vegetable = new Kale();
                        break;
                    case "pepper":
                        vegetable = new Pepper();
                        break;
                    case "tomato":
                        vegetable = new Tomato();
                        break;
                    case "beet":
                        vegetable = new Beet();
                        break;
                    case "radish":
                        vegetable = new Radish();
                        break;
                    default:
                        throw new WrongIngredientException("\nWrong ingredient");
                }
                VegetablePortion vegetablePortion = new VegetablePortion(vegetable, Double.valueOf(array[1]));
                salad.addVegetable(vegetablePortion);
            } catch (WrongIngredientException ex) {
                System.out.println(ex.getMessage());
            }
        }
        in.close();

        return salad;
    }
}
