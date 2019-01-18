package util;

import java.util.Scanner;

public class Input {

    private static Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    public static String getString(){
        return scanner.nextLine();
    }
    public static boolean yesNo(){
        System.out.println("Would you like to continue?: ");
        String y = scanner.nextLine();
        System.out.println(y);
        return(y.equalsIgnoreCase("yes") || y.equalsIgnoreCase("y"));
    }
    public static int getInt(int min, int max){
        int input = scanner.nextInt();
        if (input < min || input > max) {
            System.out.println("Number is not in range, pick another number");
            return getInt(min, max);
        }
        return input;
    }
    public static void waitForEnter(){
        scanner.nextLine();
    }
    public static int getInt(){
        return scanner.nextInt();
    }
    public static double getDouble(double min, double max){
        double input = scanner.nextDouble();
        if (input < min || input > max){
            System.out.println("Number is not in range, make another selection");
            return getDouble(min, max);
        }
        return input;
    }
    public static double getDouble(){
        return scanner.nextDouble();
    }

}

