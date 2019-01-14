package shapes;

public class Circle {
    private static double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    public static double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }
    public static double getCircumference(){
        return 2 * Math.PI * radius;
    }

}
