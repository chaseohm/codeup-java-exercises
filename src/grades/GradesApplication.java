package grades;

import util.Input;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        students.put("user1", new Student("Chase"));
        students.put("user2", new Student("Mike"));
        students.put("user3", new Student("Sam"));
        students.put("user4", new Student("Ryan"));
        students.get("user1").addGrade(89);
        students.get("user1").addGrade(93);
        students.get("user1").addGrade(91);
        students.get("user1").addGrade(72);
        System.out.println(students.get("user1").getGradeAverage());
        students.get("user2").addGrade(45);
        students.get("user2").addGrade(100);
        students.get("user2").addGrade(83);
        students.get("user2").addGrade(67);
        System.out.println(students.get("user2").getGradeAverage());
        students.get("user3").addGrade(83);
        students.get("user3").addGrade(70);
        students.get("user3").addGrade(100);
        students.get("user3").addGrade(81);
        System.out.println(students.get("user3").getGradeAverage());
        students.get("user4").addGrade(100);
        students.get("user4").addGrade(92);
        students.get("user4").addGrade(45);
        students.get("user4").addGrade(67);
        System.out.println(students.get("user4").getGradeAverage());
        for (String userName: students.keySet()){
            System.out.println(userName);
        }
        boolean loop = true;
        do {
            System.out.println("Which student would you like to view?: ");
            String input = Input.getString();
            if (!students.containsKey(input)){
                System.out.println("Your selection is not available.");
            }else{
                System.out.println("Name is " + students.get(input).getName());
                System.out.println("Grades are as follows: ");
                students.get(input).listGrades();
                System.out.println("Their average class grade is: ");
                System.out.println(students.get(input).getGradeAverage());
                System.out.println("Would you like to continue? ");
                String confirm = Input.getString();
                loop = (confirm.equalsIgnoreCase("yes") || confirm.equalsIgnoreCase("y"));
            }
        }while(loop);

    }
}
