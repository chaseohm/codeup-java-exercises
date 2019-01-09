import java.util.Scanner;

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

        System.out.print(" Enter an integer: ");
        int userInput = scanner.nextInt();
        System.out.println("Here is your table");
        System.out.println("Number  |  Squared  |  Cubed");
        System.out.println("------     -------     -----");
        for (int count = 1; count <= userInput; count++){
            System.out.println(count   +"       |     "+   count*count   +"       |     "+   count*count*count);
        }
//        System.out.println(userInput);
//        System.out.println(userInput * userInput);
//        System.out.println(userInput * userInput * userInput);

    }
}
