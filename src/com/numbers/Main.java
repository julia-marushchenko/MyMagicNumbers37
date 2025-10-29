/*
 * Java program to find numbers dividable by 3
 */

package com.numbers;

import java.util.ArrayList;
import java.util.List;

/*
 * Main class
 */
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating a list of numbers
        List<Integer> list = new ArrayList<>();

        // Filling list with numbers
        for (int index = 0; index < 1000; index++) {

            list.add(index);

        }

        // Checking if numbers are dividable by 3.
        for (int index = 0; index < 1000; index++) {

            // Condition
            if (list.get(index) % 3 == 0) {

                // Printing the result to console
                System.out.println(list.get(index) + " is dividable by 3.");

            } else {

                // Printing the result to console
                System.out.println(list.get(index) + " is not dividable by 3.");

            }

        }

    }
}