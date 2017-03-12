package com.nika.salad;

import com.nika.salad.salad.Salad;
import com.nika.salad.salad.SaladSorter;
import com.nika.salad.salad.VegetablePortion;
import com.nika.salad.vegetable.Vegetable;
import com.nika.salad.vegetable.cabbage.Broccoli;
import com.nika.salad.vegetable.cabbage.BrusselsSprouts;
import com.nika.salad.vegetable.cabbage.Kale;
import com.nika.salad.vegetable.nightshade.Pepper;
import com.nika.salad.vegetable.nightshade.Tomato;
import com.nika.salad.vegetable.rootcrop.Beet;
import com.nika.salad.vegetable.rootcrop.Carrot;
import com.nika.salad.vegetable.rootcrop.Radish;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //TODO add validation for exceptions
        //TODO add comments

        System.out.println("Please choose vegetables and their weight for salad.");
        System.out.println("1. Carrot\n2. Broccoli\n3. BrusselsSprouts\n4. Kale\n5. Pepper\n6. Tomato\n7. Beet\n8. Radish\n");

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
                case "3":
                    vegetable = new BrusselsSprouts();
                    break;
                case "4":
                    vegetable = new Kale();
                    break;
                case "5":
                    vegetable = new Pepper();
                    break;
                case "6":
                    vegetable = new Tomato();
                    break;
                case "7":
                    vegetable = new Beet();
                    break;
                case "8":
                    vegetable = new Radish();
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

            System.out.println("\nPrepare salad? (y\\n)");

            if (scanner.next().equalsIgnoreCase("Y")) {
                flag = false;
                salad.mixSalad();
            }
        }
        System.out.println("CALORIES: " + salad.countCalories());

        System.out.println("======SORTING======");
        System.out.println("\nChoose parameter for sorting: \n1. Calories. \n2. Weight. \n3. Proteins \n4. Vitamins\n" +
                "5. Carbohydrates\n");

        switch (scanner.next()) {
            case "1":
                // saladSorter.sortBy();
                break;
            default:
                System.out.println("Wrong parameter!");
                break;
        }


        System.out.println("======SEARCH======");
        System.out.print("---Vitamins: ");
        System.out.print("\n---Calories: ");
    }
}
