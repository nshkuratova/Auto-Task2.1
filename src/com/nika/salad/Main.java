package com.nika.salad;

import com.nika.salad.salad.Salad;
import com.nika.salad.salad.SaladSorter;
import com.nika.salad.salad.VegetableFinder;
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
import com.nika.salad.vegetablefilter.WeightFilter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
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
        double ingredientWeight;
        Vegetable vegetable;
        VegetablePortion vegetablePortion;

        boolean flag = true;

        while (flag) {
            System.out.print("Please enter NUMBER of ingredient " + i + ": ");
            System.out.print("Please enter WEIGHT of ingredient " + i + ": ");
            ingredientWeight = scanner.nextDouble();
            switch (scanner.next()) {
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

        System.out.println("\n======SORTING======");
        System.out.println("\nChoose parameter for sorting: \n1. Calories.  \n2. Proteins \n3. Carbohydrates\n");

        List<Vegetable> sortedVegetables;

        switch (scanner.next()) {
            case "1":
                sortedVegetables = saladSorter.sortBy(new SaladSorter.CaloriesComparator());
                break;
            case "2":
                sortedVegetables = saladSorter.sortBy(new SaladSorter.ProteintComparator());
                break;
            case "3":
                sortedVegetables = saladSorter.sortBy(new SaladSorter.CarbohydratesComparator());
                break;
            default:
                System.out.println("Wrong parameter!");
                sortedVegetables = null;
                break;
        }


        for (Vegetable veg : sortedVegetables) {
            System.out.println(veg + " " + veg.getCalories());
        }

        System.out.println("======SEARCH======");
        System.out.println("Select parameters for search: ");
        System.out.print("1. Vitamins: ");
        System.out.print("\n2. Calories: ");
        System.out.print("\n3. Proteins: ");
        System.out.print("\n4. Carbohydrates: ");
        System.out.print("\n5. Weight: ");

        flag = true;
        Collection<VegetableFinder.VegetableFilter> vegetableFilters = new ArrayList<>();
        double min;
        double max;

        while (flag) {
            switch (scanner.next()) {
                case "1":
                    System.out.println("Enter Vitamins separated by coma (E.g. A, E, D)");

                    break;
                case "2":

                    break;
                case "3":

                    break;
                case "4":

                    break;
                case "5":
                    System.out.print("Min weight: ");
                    min = scanner.nextDouble();
                    System.out.print("\nMax weight: ");
                    max = scanner.nextDouble();
                    WeightFilter weightFilter = new WeightFilter(min, max);
                    vegetableFilters.add(weightFilter);
                    break;
                default:
                    break;
            }

            System.out.println("\nAdd more search parameters? (y\\n)");

            if (scanner.next().equalsIgnoreCase("Y")) {
                flag = false;
                salad.mixSalad();
            }
        }

    }
}
