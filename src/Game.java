import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        int Health = 100;
        int Power = 100;
        int Potion = 3;
        int Mhealth = 100;
        int Mpower = 100;
        int Mpotion = 3;
        String stats = ("Monster\n" +
                "Health" + Mhealth + "\n" +
                "Power" + Mpower + "\n" +
                "Potion" + Mpotion + "\n" +
                "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n" +
                "You\n" +
                "Health" + Health + "\n" +
                "Power" + Power + "\n" +
                "Potion" + Potion);


        System.out.println("Would you like to play a game?: ");
        String userInput = scanner.next();
        if (userInput.contains("y")){
            System.out.println("Are you sure?: ");
            String response = scanner.next();
            if(response.contains("y")){
                System.out.println("Okay");
                System.out.println("Adventure Game");
                System.out.println("==============");
                System.out.println(stats);


                System.out.println("ARE YOU READY?: ");
                String ready = scanner.next();
                if (ready.contains("y")){
                    System.out.println("Fight!");
                }
                System.out.println("What is your first move?:");
                System.out.println(" 1. Punch");
                System.out.println(" 2. Run");
                System.out.println(" 3. Drink Potion");
                System.out.println("Make your selection: ");

                int action = scanner.nextInt();
                if(action == 1){
                    Mhealth -= 20;
                    String stats1 = ("Monster\n" +
                            "Health" + Mhealth + "\n" +
                            "Power" + Mpower + "\n" +
                            "Potion" + Mpotion + "\n" +
                            "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n" +
                            "You\n" +
                            "Health" + Health + "\n" +
                            "Power" + Power + "\n" +
                            "Potion" + Potion);
                    System.out.println(stats1);
                }
                if(action == 2){
                    System.out.println("He caught you.");
                }
                if(action == 3){
                    Health += 10;
                    String stats2 = ("Monster\n" +
                            "Health" + Mhealth + "\n" +
                            "Power" + Mpower + "\n" +
                            "Potion" + Mpotion + "\n" +
                            "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n" +
                            "You\n" +
                            "Health" + Health + "\n" +
                            "Power" + Power + "\n" +
                            "Potion" + Potion);
                    System.out.println(stats2);
                }





            }
        }
    }
}