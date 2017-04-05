package com.nika.salad.salad;

import com.nika.salad.vegetable.Vegetable;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * SaladSorter is a class used to perform sorting of vegetables in a salad by different criteria.
 */
public class SaladSorter {
    private Salad salad;

    /**
     * Constructor with a parameter to create an object of SaladSorter class.
     *
     * @param salad an object of salad
     * @throws NullPointerException if an empty salad (contains link which points to null) was passed to the constructor
     */
    public SaladSorter(Salad salad) throws NullPointerException {
        if (salad == null) {
            throw new NullPointerException("Salad is null!");
        }
        this.salad = salad;
    }

    /**
     * Method used to sort vegetables by certain parameters and return a sorted list.
     *
     * @param vegetableComparator one of the classes implementing Comparator<Vegetable> interface is passed as a parameter depending on which type of sorting user has chosen
     * @return a list of sorted vegetables according to the chosen by user type of sorting
     * @throws NullPointerException if a vegetableComparator points at a link which contains null
     */
    public List<Vegetable> sortBy(Comparator<Vegetable> vegetableComparator) throws NullPointerException {
        if (vegetableComparator == null) {
            throw new NullPointerException("Sorting parameter is not chosen.");
        }
        List<Vegetable> vegetables = salad.getVegetables();
        Collections.sort(vegetables, vegetableComparator);
        return vegetables;
    }

    /**
     * Class which implements sorting by calories using Comparator<T> interface
     *
     * @see Comparator
     */
    public static class CaloriesComparator implements Comparator<Vegetable> {

        /**
         * Compares its two arguments for order.  Returns a negative integer,
         * zero, or a positive integer as the first argument is less than, equal
         * to, or greater than the second.<p>
         *
         * @param o1 the first object to be compared.
         * @param o2 the second object to be compared.
         * @return a negative integer, zero, or a positive integer as the
         * first argument is less than, equal to, or greater than the
         * second.
         */
        @Override
        public int compare(Vegetable o1, Vegetable o2) {
            if (o1.getCalories() > o2.getCalories()) {
                return -1;
            } else if (o1.getCalories() < o2.getCalories()) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    /**
     * Class which implements sorting by proteins using Comparator<T> interface
     *
     * @see Comparator
     */
    public static class ProteintComparator implements Comparator<Vegetable> {

        /**
         * Compares its two arguments for order.  Returns a negative integer,
         * zero, or a positive integer as the first argument is less than, equal
         * to, or greater than the second.<p>
         *
         * @param o1 the first object to be compared.
         * @param o2 the second object to be compared.
         * @return a negative integer, zero, or a positive integer as the
         * first argument is less than, equal to, or greater than the
         * second.
         */
        @Override
        public int compare(Vegetable o1, Vegetable o2) {
            if (o1.getProteins() > o2.getProteins()) {
                return -1;
            } else if (o1.getProteins() < o2.getProteins()) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    /**
     * Class which implements sorting by carbohydrates using Comparator<T> interface
     *
     * @see Comparator
     */
    public static class CarbohydratesComparator implements Comparator<Vegetable> {

        /**
         * Compares its two arguments for order.  Returns a negative integer,
         * zero, or a positive integer as the first argument is less than, equal
         * to, or greater than the second.<p>
         *
         * @param o1 the first object to be compared.
         * @param o2 the second object to be compared.
         * @return a negative integer, zero, or a positive integer as the
         * first argument is less than, equal to, or greater than the
         * second.
         */
        @Override
        public int compare(Vegetable o1, Vegetable o2) {
            if (o1.getCarbohydrates() > o2.getCarbohydrates()) {
                return -1;
            } else if (o1.getCarbohydrates() < o2.getCarbohydrates()) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
