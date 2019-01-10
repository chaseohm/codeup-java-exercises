import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.println(addition(2, 3));
        System.out.println(subtract(8, 4));
        System.out.println(multiply(5, 3));
        System.out.println(divide(10, 1));
        System.out.println(modulus(20, 10));
        System.out.print("Enter a number between 1 and 10: ");
        System.out.println(getInteger(1, 10));
        System.out.println("Pick a number and get the factorial: ");
        int input = scanner.nextInt();
        System.out.println(factorial(input));
        System.out.println(dice());

    }

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static int modulus(int a, int b) {
        return a % b;
    }

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input < min || input > max) {
            System.out.println("Number is not in range, pick another number");
            return getInteger(min, max);
        }
        return input;
    }

    public static long factorial(int input) {
        Scanner scanner = new Scanner(System.in);
        long hold = 1;
        if (input < 1 || input > 10) {
            System.out.println("Pick a different number between 1 and 10");
            input = scanner.nextInt();
            factorial(input);
        }
        for (int count = 1; count <= input; count++) {
            hold *= count;
        }
        return hold;
    }

    public static long dice() {
        System.out.println("Please enter amount of sides for the die: ");
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        int userInput = scanner.nextInt();
        int sides = userInput;
        int sides2 = userInput;
        System.out.println("You chose: " + sides);
        System.out.println("Please enter amount of sides for dice #2: ");
        System.out.println("You chose: " + sides2);
        System.out.println("Would you like to roll: ");
        String rollDice = scanner.next();
        if (rollDice.equalsIgnoreCase("y")){
            sides = (int) (Math.random() * sides) + 1;
            sides2 = (int) (Math.random() * sides2) + 1;
            System.out.println(sides);
            System.out.println(sides2);
        }
        return dice();

        }


    }



