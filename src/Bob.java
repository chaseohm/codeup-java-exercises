import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ask Bob a question: ");
        String userInput = scanner.next();
        if (userInput.contains("?")) {

            System.out.println("sure");
        }
        else if (userInput.contains("!")){
            System.out.println("Woah, chill out!");
        }
        else if (userInput.equals("")){
            System.out.println("Fine be that way.");
        }
        else {
            System.out.println("Whatever");
        }
    }

}