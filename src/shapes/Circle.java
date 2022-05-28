// TODO: Inside of src, create a package named shapes. Inside of shapes, create a class named Circle.
//  This class should have a private radius field that is set through the constructor, and various methods for
//  getting information about the circle, detailed below.
//  public Circle(double radius)
//  public double getArea()
//  public double getCircumference()

package shapes;

public class Circle {
    private double radius;
    private static int count;

    public Circle(double radius){
        this.radius = radius;
        Circle.count++;
    }

    public double getArea(){
        return Math.PI * (Math.pow(radius, 2));
    }

    public double getCircumference(){
        return (2 * Math.PI) * radius;
    }

    public static int getCount(){
        return count;
    }

}
