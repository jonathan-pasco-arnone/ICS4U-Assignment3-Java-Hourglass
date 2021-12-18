/*
* This program makes an hourglass.
*
* @author  Jonathan Pasco-Arnone
* @version 1.0
* @since   2021-12-15
*/

import java.util.Scanner;

/**
* This program makes an hourglass.
*/
final class Hourglass {

    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Hourglass() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * Creates the hourglass.
    *
    * @param sand the amount of sand in the hourglass
    * @param centre the amount of extra spaces to centre the sand
    */
    static void hourglass(final int sand, final int centre) {
        String hourglassStr = "";
        int counter1;
        int counter2;
        for (counter1 = 0; counter1 < centre; counter1++) {
            hourglassStr += " ";
        }

        for (counter2 = 0; counter2 < sand; counter2++) {
            hourglassStr += "* ";
        }
        System.out.println(hourglassStr);

        if (sand > 1) {
            hourglass(sand - 1, centre + 1);
        }
        System.out.println(hourglassStr);
    }

    /**
    * This is the main function.
    *
    * @param args this will not be used
    */
    public static void main(final String[] args) {
        final String invalidInputStr = "\nInvalid Input";

        System.out.println("Hourglass");

        // input
        final Scanner userInput = new Scanner(System.in);
        System.out.print("\nPlease input a number greater than 1: ");

        try {
            final int sandInput = userInput.nextInt();
            System.out.println();
            if (sandInput > 1) {
                // process
                hourglass(sandInput, 0);
            } else {
                System.out.println(invalidInputStr);
            }
        } catch (java.util.InputMismatchException ex) {
            System.err.print(invalidInputStr);
        }
    }
}
