//import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

//        int i = 5;
//        long a = 2;
//        while (i <= 15) {
//            System.out.println("i is " + i);
//            i++;
//        }
//        do {
//            System.out.println("a is " + a);
//            a=a * a;
//        } while (a <= 1000000);

//        for(int i = 5; i <= 15; i += 1) {
//            System.out.println("i is " + i);
//        }
//        for(long a = 2; a <= 1000000; a = a * a) {
//            System.out.println("a is " + a);
//        }
//
//
//
//        for(int n = 1; n <= 100; n++){
//            if (n % 3 == 0){
//                if (n % 5 == 0){
//                    System.out.println("Fizz Buzz " + n);
//                }else
//                System.out.println("Fizz " + n);
//
//            } else if (n % 5 == 0){
//                System.out.println("Buzz " + n);
//            }else{
//                System.out.println(n);
//            }
//        }


        System.out.println("Please enter an integer: ");
        String userInput = scanner.next();
        System.out.println("You gave me " + userInput);
    }
}
