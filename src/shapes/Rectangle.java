package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public void setLength() {

    }

    @Override
    public void setWidth() {

    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public double getArea() {
        return width * length;
    }
    //    protected double length;
//    protected double width;
//
//    public Rectangle(){
//        this.length = length;
//        this.width = width;
//    }
//
//    public Rectangle(double length, double width){
//        this.length = length;
//        this.width = width;
//    }
//
//    public double getArea(){
//        double area = this.length *  this.width;
//        return area;
//    }
//    public double getPerimeter(){
//        double perimeter = (2 * this.length) + (2 * this.width);
//        return perimeter;
//    }
}
