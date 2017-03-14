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
import com.nika.salad.vegetablefilter.CaloriesFilter;
import com.nika.salad.vegetablefilter.CarbohydratesFilter;
import com.nika.salad.vegetablefilter.ProteinsFilter;
import com.nika.salad.vegetablefilter.WeightFilter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //TODO add comments

        System.out.println("Please choose vegetables and their weight for salad.");
        System.out.println("1. Carrot\n2. Broccoli\n3. BrusselsSprouts\n4. Kale\n5. Pepper\n6. Tomato\n7. Beet\n8. Radish");

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
            System.out.print("\nPlease enter NUMBER of ingredient " + i + ": ");
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

        System.out.println("\nSORTED VEGETABLES:");
        for (Vegetable veg : sortedVegetables) {
            System.out.println(veg + " " + veg.getCalories());
        }

        System.out.println("\n======SEARCH======");
        System.out.println("Select search parameter: ");
        System.out.print("1. Vitamins");
        System.out.print("\n2. Calories");
        System.out.print("\n3. Proteins");
        System.out.print("\n4. Carbohydrates");
        System.out.print("\n5. Weight\n\n");

        flag = true;
        Collection<VegetableFinder.VegetableFilter> vegetableFilters = new ArrayList<>();
        double min;
        double max;

        while (flag) {
            switch (scanner.next()) {
                case "1":
                    System.out.println("Enter Vitamins separated by coma (E.g. A, E, D)");
                    //TODO search by vitamins
                    break;
                case "2":
                    System.out.print("\nMin calories: ");
                    min = scanner.nextDouble();
                    System.out.print("\nMax calories: ");
                    max = scanner.nextDouble();
                    CaloriesFilter caloriesFilter = new CaloriesFilter(min, max);
                    vegetableFilters.add(caloriesFilter);
                    break;
                case "3":
                    System.out.print("\nMin proteins: ");
                    min = scanner.nextDouble();
                    System.out.print("\nMax proteins: ");
                    max = scanner.nextDouble();
                    ProteinsFilter proteinsFilter = new ProteinsFilter(min, max);
                    vegetableFilters.add(proteinsFilter);
                    break;
                case "4":
                    System.out.print("\nMin carbohydrates: ");
                    min = scanner.nextDouble();
                    System.out.print("\nMax carbohydrates: ");
                    max = scanner.nextDouble();
                    CarbohydratesFilter carbohydratesFilter = new CarbohydratesFilter(min, max);
                    vegetableFilters.add(carbohydratesFilter);
                    break;
                case "5":
                    System.out.print("\nMin weight: ");
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

            if (scanner.next().equalsIgnoreCase("N")) {
                flag = false;
                System.out.println("\nSEARCH RESULTS");
                VegetableFinder vegetableFinder = new VegetableFinder(salad);
                Collection<Vegetable> vegetableCollection = new ArrayList<>(vegetableFinder.findVegetables(vegetableFilters));
                if (!vegetableCollection.isEmpty()) {
                    vegetableCollection.forEach(System.out::println);
                }
                else System.out.println("No corresponding search results!");
            }
        }

    }
}
