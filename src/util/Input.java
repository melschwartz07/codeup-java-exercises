package util;
import java.util.Scanner;
// TODO: Inside of util, create a class named Input that has a private field named scanner.
//  When an instance of this object is created, the scanner field should be set to a new instance of the Scanner class.
//  The class should have the following methods, all of which return command line input from the user:
//
//        String getString()
//        boolean yesNo()
//        int getInt(int min, int max)
//        int getInt()
//        double getDouble(double min, double max)
//        double getDouble()
//        The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.
//
//  The getInt(int min, int max) method should keep prompting the user for input until they give an integer within
//  the min and max. The getDouble method should do the same thing, but with decimal numbers.


public class Input {
    public static void main(String[] args) {
        Input input = new Input();

        System.out.println("Type a word");
        System.out.println(input.getString());
        System.out.println(input.getInt(5, 10));
        System.out.println(input.getDouble(5, 10));
        System.out.println(input.yesNo());
    }
    private Scanner scanner = new Scanner(System.in);

    public String getString() {
        return scanner.nextLine();
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return getString();
    }

    public boolean yesNo() {
        System.out.println("Type: (yes/y)");
        String input = getString();
        return input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y");
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        return yesNo();
    }

    public int getInt(int min, int max) {
        int userNumber = getInt();

        if (userNumber < min) {
            System.out.println("Number entered is below the minimum.");
            return getInt(min, max);
        } else if (userNumber > max) {
            System.out.println("Number entered is above the maximum.");
            return getInt(min, max);
        }

        return userNumber;
    }

    public int getInt() {
        System.out.println("Enter a number below.");
        return Integer.parseInt(getString());
    }

    public int getInt(String prompt) {
        System.out.println(prompt);
        return getInt(5, 10);
    }

    public double getDouble(double min, double max) {
        double userNumber = getDouble();

        if (userNumber < min) {
            System.out.println("Number entered is below the minimum.");
            return getDouble(min, max);
        } else if (userNumber > max) {
            System.out.println("Number entered is above the maximum.");
            return getDouble(min, max);
        }

        return userNumber;
    }

    public double getDouble() {
        System.out.println("Enter a number below.");
        return Double.parseDouble(getString());
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        return getDouble(5, 10);
    }

}