package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        System.out.println("Enter the radius of your circle: ");
        Circle c1 = new Circle(Input.getDouble());
        System.out.println("The area is " + Circle.getArea());
        System.out.println("And the circumference is " + Circle.getCircumference());
    }


}
