import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        int number = (int) (Math.random() * 100) + 1;
        System.out.println("I have selected a number, start guessing: ");
        boolean guessing = true;
        int guess = scanner.nextInt();
        while (guessing){
            if(guess == number){
                System.out.println("You guessed correctly!");
                guessing = false;
            }if(guess < number){
                System.out.println("Too low!");
                guess = scanner.nextInt();
            }if(guess > number){
                System.out.println("Too high!");
                guess = scanner.nextInt();
            }

        }
    }
}