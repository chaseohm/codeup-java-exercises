package util;

import java.util.Scanner;

public class Input {

    private static Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    public static String getString() {
        return scanner.nextLine();
    }

    public static boolean yesNo() {
        System.out.println("Would you like to continue?: ");
        String y = scanner.nextLine();
        System.out.println(y);
        return (y.equalsIgnoreCase("yes") || y.equalsIgnoreCase("y"));
    }

    class NumberFormatException extends Exception {
    }

    public static int getInt(int min, int max) {
        int input = 0;
        try {
            input = scanner.nextInt();
            System.out.println("You entered an Integer.");

            if (input < min || input > max) {
                System.out.println("Number is not in range, pick another number");
                return getInt(min, max);
            }

        } catch (Exception a) {
            System.out.println("You did not enter an integer.");

        }
        return input;
    }

    public static void waitForEnter() {
        scanner.nextLine();
    }

    public static int getInt() {
        String hold = scanner.nextLine();
        int result;

        try {
            result = Integer.valueOf(hold);
        } catch (java.lang.NumberFormatException e) {
            System.out.println("You did not enter an Integer, try again.");
            return getInt();
        }
        return result;
    }

    public static double getDouble(double min, double max) {
        double input = scanner.nextDouble();
        if (input < min || input > max) {
            System.out.println("Number is not in range, make another selection");
            return getDouble(min, max);
        }
        return input;
    }

    public static double getDouble() {
        String hold = scanner.nextLine();
        double result;

        try {
            result = Double.valueOf(hold);
        } catch (java.lang.NumberFormatException e) {
            System.out.println("You did not enter correctly, try again.");
            return getDouble();
        }
        return result;


    }
    public static int getIntHex(){
        String hold = scanner.nextLine();
        int result;

        try {
            result = Integer.valueOf(hold, 16);
        } catch (java.lang.NumberFormatException e) {
            System.out.println("You did not enter an Integer, try again.");
            return getIntHex();
        }
        return result;
    }
    public static int getBinary(){
        String hold = scanner.nextLine();
        int result;

        try {
            result = Integer.valueOf(hold, 2);
        } catch (java.lang.NumberFormatException e) {
            System.out.println("You did not enter an Integer, try again.");
            return getBinary();
        }
        return result;
    }
}

