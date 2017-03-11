package com.nika.salad;

import com.nika.salad.salad.Salad;
import com.nika.salad.salad.SaladSorter;
import com.nika.salad.salad.VegetablePortion;
import com.nika.salad.vegetable.Vegetable;
import com.nika.salad.vegetable.cabbage.Broccoli;
import com.nika.salad.vegetable.rootcrop.Carrot;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // String chosenVegerables;

        System.out.println("Please choose vegetables and their weight for salad.");
        System.out.println("1. Carrot\n2. Broccoli\n");
        //System.out.print("Your choice for salad: ");

        Scanner scanner = new Scanner(System.in);

        Salad salad = new Salad();
        SaladSorter saladSorter = new SaladSorter(salad);

        int i = 1;
        String ingredient;
        double ingredientWeight;
        Vegetable vegetable;
        VegetablePortion vegetablePortion;

        while (true) {
            System.out.print("Please enter NUMBER of ingredient " + i + ": ");
            ingredient = scanner.next();
            System.out.print("Please enter WEIGHT of ingredient " + i + ": ");
            ingredientWeight = scanner.nextDouble();
            switch (ingredient) {
                case "1":
                    vegetable = new Carrot();
                    vegetablePortion = new VegetablePortion(vegetable, ingredientWeight);
                    break;
                case "2":
                    vegetable = new Broccoli();
                    vegetablePortion = new VegetablePortion(vegetable, ingredientWeight);
                    break;
                default:
                    break;
            }
            i++;
            System.out.println("\nFinish?");
            if (scanner.next().equalsIgnoreCase("Y")) {
                return;
            }
        }


       /* chosenVegerables = scanner.next();

        String[] parts = chosenVegerables.split(",");

        for (int i = 0; i < parts.length ; i++) {
            switch (parts[i]) {
                case "1":

                    break;
            }
        }*/

    }
}
