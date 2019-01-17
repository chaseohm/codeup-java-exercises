package shapes;

public class Square extends Quadrilateral{
    public Square(int side) {
        super(side, side);
    }

    @Override
    public void setLength() {

    }

    @Override
    public void setWidth() {

    }

    @Override
    public double getPerimeter() {
        return Math.pow(length, 2);
    }

    @Override
    public double getArea() {
        return 4 * length;
    }
    //    private double side;
//
//
//    public Square(double length, double width) {
//        super(length, width);
//    }
//
//    public Square(double side) {
//        super(side, side);
//        this.side = side;
//    }
//
//    @Override
//    public double getArea(){
//        double area = Math.pow(this.side, 2);
//        return area;
//    }
//    @Override
//    public double getPerimeter(){
//        double perimeter = 4 * this.side;
//        return perimeter;
//    }

}
