package com.nika.salad;

import com.nika.salad.exceptions.NoVegetablesInSaladException;
import com.nika.salad.exceptions.WrongIngredientException;
import com.nika.salad.exceptions.WrongSortTypeException;
import com.nika.salad.salad.Salad;
import com.nika.salad.salad.SaladSorter;
import com.nika.salad.salad.VegetableFinder;
import com.nika.salad.salad.VegetablePortion;
import com.nika.salad.salad.dao.FileDAO;
import com.nika.salad.salad.vegetablefilter.*;
import com.nika.salad.vegetable.Vegetable;
import com.nika.salad.vegetable.Vitamins;
import com.nika.salad.vegetable.cabbage.Broccoli;
import com.nika.salad.vegetable.cabbage.Brussels;
import com.nika.salad.vegetable.cabbage.Kale;
import com.nika.salad.vegetable.nightshade.Pepper;
import com.nika.salad.vegetable.nightshade.Tomato;
import com.nika.salad.vegetable.rootcrop.Beet;
import com.nika.salad.vegetable.rootcrop.Carrot;
import com.nika.salad.vegetable.rootcrop.Radish;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws WrongIngredientException, WrongSortTypeException, NoVegetablesInSaladException, IOException, ClassNotFoundException {

        //TODO add comments
        System.out.println("Please select the way to work with the app: \n1. Console,\n2. File,\n3. Database \n");
        Scanner scanner = new Scanner(System.in);
        int inputMethod;
        //TODO exception handling
        try {
            inputMethod = scanner.nextInt();

            Salad salad = new Salad();

            if (inputMethod == 1) {
                //method used to receive salad ingredients from console
                salad = enterFromConsole(scanner, salad);
            }
            //method used to receive salad ingredients from file
            else if (inputMethod == 2) {
                FileDAO file = new FileDAO();
                salad = file.readSalad();
                file.saveSalad(salad);
            }

            // if there are no ingredients in salad we can't continue work with the app
            if (salad.getVegetables().isEmpty()) {
                throw new NoVegetablesInSaladException("No vegetables in salad.");
            }
            salad.mixSalad();

            //method used to count and display the number of calories in a salad
            countCalories(salad);

            System.out.println("\n======SORTING======");
            System.out.println("\nChoose parameter for sorting: \n1. Calories.  \n2. Proteins \n3. Carbohydrates\n");
            String sortingMethod = scanner.next();

            //method used to sort the vegetables in a salad according to the chosen parameter and to display the results
            /*??? maybe it would be better to create a separate method for display of the results and only do sorting in this method,
            but do not want to complicate the code*/
            sortSalad(salad, sortingMethod);

            System.out.println("\n======SEARCH======");
            System.out.println("Select search parameter: ");
            System.out.print("1. Vitamins");
            System.out.print("\n2. Calories");
            System.out.print("\n3. Proteins");
            System.out.print("\n4. Carbohydrates");
            System.out.print("\n5. Weight\n\n");

            //method used to search vegetables by different parameters and to display the results
            /*??? maybe it would be better to create a separate method for entering of search criteria,  display of the results and only do search in this method,
            but do not want to complicate the code*/
            searchVegetable(salad, scanner);
        } catch (NoVegetablesInSaladException ex) {
            System.out.println(ex.getMessage());
            System.out.println("The application will be closed.");
            return;

        }
    }

    public static void sortSalad(Salad salad, String sortingMethod) {

        SaladSorter saladSorter = new SaladSorter(salad);
        List<Vegetable> sortedVegetables;

        try {
            switch (sortingMethod) {
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
                    throw new WrongSortTypeException("Wrong sorting parameter");
            }

            System.out.println("\nSORTED VEGETABLES:");
            System.out.println("\nNAME         CALORIES   PROTEINS CARBOHYDRATES");
            for (Vegetable veg : sortedVegetables) {
                System.out.println(veg + "      " + veg.getCalories() + "       " + veg.getProteins() + "       " + veg.getCarbohydrates());
            }
        } catch (WrongSortTypeException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static void countCalories(Salad salad) {
        System.out.println("CALORIES: " + salad.countCalories());
    }

    public static void searchVegetable(Salad salad, Scanner scanner) {

        boolean continueEnteringVitaminsFlag = true;
        Collection<VegetableFinder.VegetableFilter> vegetableFilters = new ArrayList<>();
        double min;
        double max;

        try {

            while (continueEnteringVitaminsFlag) {
                switch (scanner.nextInt()) {
                    case 1:
                        System.out.println("Enter Vitamins separated by coma (E.g. A, E, D)");
                        scanner.nextLine();
                        String temp = scanner.nextLine();
                        temp = temp.replaceAll(" ", "");
                        String[] enteredVitamins = temp.toUpperCase().split(",");
                        Vitamins[] vit = new Vitamins[enteredVitamins.length];

                        for (int j = 0; j < enteredVitamins.length; j++) {
                            vit[j] = Vitamins.valueOf(enteredVitamins[j]);
                        }

                        VitaminsFilter vitaminsFilter = new VitaminsFilter(vit);
                        vegetableFilters.add(vitaminsFilter);
                        break;
                    case 2:
                        System.out.print("\nMin calories: ");
                        min = scanner.nextDouble();
                        System.out.print("Max calories: ");
                        max = scanner.nextDouble();
                        CaloriesFilter caloriesFilter = new CaloriesFilter(min, max);
                        vegetableFilters.add(caloriesFilter);
                        break;
                    case 3:
                        System.out.print("\nMin proteins: ");
                        min = scanner.nextDouble();
                        System.out.print("Max proteins: ");
                        max = scanner.nextDouble();
                        ProteinsFilter proteinsFilter = new ProteinsFilter(min, max);
                        vegetableFilters.add(proteinsFilter);
                        break;
                    case 4:
                        System.out.print("\nMin carbohydrates: ");
                        min = scanner.nextDouble();
                        System.out.print("Max carbohydrates: ");
                        max = scanner.nextDouble();
                        CarbohydratesFilter carbohydratesFilter = new CarbohydratesFilter(min, max);
                        vegetableFilters.add(carbohydratesFilter);
                        break;
                    case 5:
                        System.out.print("\nMin weight: ");
                        min = scanner.nextDouble();
                        System.out.print("Max weight: ");
                        max = scanner.nextDouble();
                        WeightFilter weightFilter = new WeightFilter(min, max);
                        vegetableFilters.add(weightFilter);
                        break;
                    default:
                        break;
                }
            }
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("\nAdd more search parameters? (y\\n)");

        if (!scanner.next().equalsIgnoreCase("Y")) {
            continueEnteringVitaminsFlag = false;
            System.out.println("\nSEARCH RESULTS");
            VegetableFinder vegetableFinder = new VegetableFinder(salad);
            Collection<Vegetable> vegetableCollection = new ArrayList<>(vegetableFinder.findVegetables(vegetableFilters));
            if (!vegetableCollection.isEmpty()) {
                vegetableCollection.forEach(System.out::println);
            } else System.out.println("No corresponding search results!");
        } else {
            System.out.print("\nNext search parameter: ");
        }


    }

    public static Salad enterFromConsole(Scanner scanner, Salad salad) {
        System.out.println("\nPlease choose vegetables and their weight for salad.");
        System.out.println("1. Carrot\n2. Broccoli\n3. Brussels\n4. Kale\n5. Pepper\n6. Tomato\n7. Beet\n8. Radish");

        int ingredientNumber = 1;
        int ingredient;
        double ingredientWeight;
        Vegetable vegetable;
        VegetablePortion vegetablePortion;

        boolean continueEnteringIngredientsFlag = true;

        while (continueEnteringIngredientsFlag) {
            System.out.print("\nPlease enter NUMBER of ingredient " + ingredientNumber + ": ");
            ingredient = scanner.nextInt();
            System.out.print("Please enter WEIGHT of ingredient " + ingredientNumber + ": ");
            ingredientWeight = scanner.nextDouble();

            try {
                switch (ingredient) {
                    case 1:
                        vegetable = new Carrot();
                        break;
                    case 2:
                        vegetable = new Broccoli();
                        break;
                    case 3:
                        vegetable = new Brussels();
                        break;
                    case 4:
                        vegetable = new Kale();
                        break;
                    case 5:
                        vegetable = new Pepper();
                        break;
                    case 6:
                        vegetable = new Tomato();
                        break;
                    case 7:
                        vegetable = new Beet();
                        break;
                    case 8:
                        vegetable = new Radish();
                        break;
                    default:
                        throw new WrongIngredientException("\nWrong ingredient");
                }

                ingredientNumber++;
                vegetablePortion = new VegetablePortion(vegetable, ingredientWeight);
                salad.addVegetable(vegetablePortion);
            } catch (WrongIngredientException ex) {
                System.out.println(ex.getMessage());
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }

            System.out.println("\nPrepare salad? (y\\n)");

            if (scanner.next().equalsIgnoreCase("Y")) {
                continueEnteringIngredientsFlag = false;
            }
        }
        return salad;
    }
}
