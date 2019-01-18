package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    ArrayList<Integer> grade = new ArrayList<>();

    public  Student (String name){
        this.name = name;
        this.grade = new ArrayList<>();

    }
    // returns the student's name
    public String getName(){
        return this.name;
    }
    // adds the given grade to the grades property
    public void addGrade(int newGrade){
        this.grade.add(newGrade);
    }
    // returns the average of the students grades
    public double getGradeAverage(){
        int length = this.grade.size();
        double hold = 0;
        for (int i = 0; i < length; i++){
            hold += this.grade.get(i);
        }
        return hold / length;
    }
    public void listGrades(){
        int length = this.grade.size();
        for (int i = 0; i < length; i++){
            System.out.println(this.grade.get(i));
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("Ryan");
        student1.addGrade(99);
        student1.addGrade(95);
        student1.addGrade(91);
        System.out.println("Student: " + student1.getName());
        System.out.println("Your class average is " + student1.getGradeAverage());
    }
}

