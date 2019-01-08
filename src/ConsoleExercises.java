import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        double pi = 3.14159;
        System.out.format("The value of pi is approximately %s",pi);

        System.out.print(" Enter an integer: ");
        String userInput = scanner.next();

        System.out.println("You entered: --> \"" + userInput + "\" <--");

        System.out.print(" Enter three words: ");
        String userInputS1 = scanner.next();
        String userInputS2 = scanner.next();
        String userInputS3 = scanner.next();
        System.out.println("You entered: " + userInputS1 + userInputS2 + userInputS3);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.next();
        System.out.println("You said " + sentence + "?");

        System.out.println("Let's calculate our classroom size!");
        System.out.print("What is the length?: ");
        double length = Double.parseDouble(scanner.next());
        System.out.print("And what is the width?: ");
        double width = Double.parseDouble(scanner.next());
        System.out.println("Lastly, what is the height?: ");
        double height = Double.parseDouble(scanner.next());

        double area = length * width;
        System.out.println("The area of the room is " + area +"ft.");
        double perimeter = length + length + width + width;
        System.out.println("The perimeter of the room is " + perimeter + "ft.");
        double volume = length * width * height;
        System.out.println("And the volume of the room is " + volume + ".");


    }
}
