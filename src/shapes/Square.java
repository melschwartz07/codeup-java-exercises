// TODO: Create a class named Square, also inside of shapes, that extends Rectangle.
//  Square should define a constructor that accepts one argument, side, and calls the parent's
//  constructor to set both the length and width to the value of side.

//Change your existing Square class to extend Quadrilateral.
// Because the length of all sides of a square are the same, the methods for setting the
// length and the width should set both protected properties.
package shapes;

public class Square extends Quadrilateral {

    public Square(double side){
        super(side,side);
    }
    @Override
    public void setLength(double length){
        this.length = length;
        this.width = length;
    }

    @Override
    public void setWidth(double width){
        this.length = width;
        this.width = width;
    }

    @Override
    public double getArea(){
        System.out.println("Square A: ");
        return Math.pow(this.width, 2);
    }

    @Override
    public double getPerimeter(){
        System.out.println("Square P: ");
        return 4 * this.length;
    }

}