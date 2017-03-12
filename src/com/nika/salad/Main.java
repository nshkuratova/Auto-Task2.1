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

        System.out.println("Please choose vegetables and their weight for salad.");
        System.out.println("1. Carrot\n2. Broccoli\n");

        Scanner scanner = new Scanner(System.in);

        Salad salad = new Salad();
        SaladSorter saladSorter = new SaladSorter(salad);

        int i = 1;
        String ingredient;
        double ingredientWeight;
        Vegetable vegetable;
        VegetablePortion vegetablePortion;

        boolean flag = true;

        while (flag) {
            System.out.print("Please enter NUMBER of ingredient " + i + ": ");
            ingredient = scanner.next();
            System.out.print("Please enter WEIGHT of ingredient " + i + ": ");
            ingredientWeight = scanner.nextDouble();
            switch (ingredient) {
                case "1":
                    vegetable = new Carrot();
                    break;
                case "2":
                    vegetable = new Broccoli();
                    break;
                default:
                    vegetable = null;
                    break;
            }

            i++;

            if (vegetable != null) {
                vegetablePortion = new VegetablePortion(vegetable, ingredientWeight);
                salad.addVegetable(vegetablePortion);
            } else {
                System.out.println("Wrong vegetable!");
            }

            System.out.println("\nPrepare salad?");

            if (scanner.next().equalsIgnoreCase("Y")) {
                flag = false;
                salad.mixSalad();
            }
        }
        System.out.println("CALORIES: " + salad.countCalories());
    }
}
