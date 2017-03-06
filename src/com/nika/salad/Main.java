package com.nika.salad;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {

        String chosenVegerables;

        System.out.println("Please choose vegetables and their weight for salad. Write down corresponding numbers and weight separated by comas. E.g. 1 - 100,3 - 2000,5 - 40 ");
        System.out.println("1. Carrot\n2. Broccoli");
        System.out.print("Your choice for salad: ");

        Scanner scanner = new Scanner(System.in);
        chosenVegerables = scanner.next();

        String[] parts = chosenVegerables.split(",");

        for (int i = 0; i < parts.length ; i++) {
            switch (parts[i]) {
                case "1":

                    break;
            }
        }

    }
}
