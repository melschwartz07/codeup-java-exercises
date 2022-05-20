// TODO: Inside of shapes, create a class named CircleApp that prompts the user for the radius of the circle
//  using your Input class, creates a Circle object, and displays the circumference and area.
//  (Note that you will need to import your Input class.)

package shapes;
import util.Input;

public class CircleApp {
    private static Input input = new Input();

    public static void makeCircle(){
        Circle circle = new Circle(input.getDouble());
        System.out.println("the area = " + circle.getArea());
        System.out.println("the circumference = " + circle.getCircumference());
        }


public static void main(String[] args){
    makeCircle();
}
}