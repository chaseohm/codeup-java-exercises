package shapes;

public class Square extends Rectangle{
    private double side;


    public Square(double length, double width) {
        super(length, width);
    }

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public double getArea(){
        double area = Math.pow(this.side, 2);
        return area;
    }
    @Override
    public double getPerimeter(){
        double perimeter = 4 * this.side;
        return perimeter;
    }

}
