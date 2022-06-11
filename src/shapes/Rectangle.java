// TODO: Inside of your shapes directory, create a class named Rectangle. It should have protected properties for both
//  length and width. Rectangle should define a constructor that accepts two numbers for length and width, and sets those properties.
//  Create two methods on the Rectangle class, getArea and getPerimeter that return the respective values.

package shapes;

public class Rectangle extends Quadrilateral implements Measurable{
    public Rectangle(double length,double width){
        super(length,width);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 2 * this.getLength() + 2 * this.getWidth();
    }

    @Override
    public double getArea() {
        return this.getLength() * this.getWidth();
    }


//    protected double length;
//    protected double width;
//
//    public Rectangle(double l, double w){
//        this.length = l;
//        this.width = w;
//    }
//
//    public double getArea(){
//        return this.width * this.length;
//    }
//
//    public double getPerimeter(){
//        return (2 * this.length) + (2 * this.width);
//    }
}
