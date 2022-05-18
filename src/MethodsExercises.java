import java.util.Scanner;
public class MethodsExercises {
    public static void main(String[] args) {
        MethodsExercises obj = new MethodsExercises();
        //This will call the add method
        System.out.println("add two numbers: " + obj.add(10, 20));
        //This will call subtract method
        System.out.println("Subtract two numbers: "+obj.subtract(30, 20));
        //This will call multiply method
        System.out.println("multipy two numbers: " + obj.multiply(6, 6));
        //This will call divide method
        System.out.println("divide two numbers: " + obj.divide(50, 10));
        //call getInteger method
        getInteger(1,10);
        //call factorial method
        factorial(1,10);
    }

// TODO: Basic Arithmetic
//  Create four separate methods. Each will perform an arithmetic operation:
//  Addition
//  Subtraction
//  Multiplication
//  Division
//  Each function needs to take two parameters/arguments so that the operation can be performed.
//  Test your methods and verify the output.
//  Add a modulus method that finds the modulus of two numbers.
//  Food for thought: What happens if we try to divide by zero? What should happen?
//  Bonus
//  Create your multiplication method without the * operator (Hint: a loop might be helpful).
//  Do the above with recursion.


    int add(int num1, int num2) {
        return num1 + num2;
    }
    int subtract(int num1, int num2) {
        return num1 - num2;
    }
    int multiply(int num1, int num2) {
        return num1 * num2;
    }
    int divide(int num1, int num2){
        return num1 / num2;
    }
// TODO: Create a method that validates that user input is in a certain range
//    If the input is invalid, prompt the user again.

    public static int getInteger(int min, int max) {
        System.out.print("Enter a number between 1 and 10: ");
        Scanner scanner = new Scanner(System.in);

        int userInput = scanner.nextInt();

        while (userInput < min || userInput > max) {
            System.out.print("The number you entered is not valid. Please try again: ");
            userInput = scanner.nextInt();
        }
        while (userInput <= 10) {
            System.out.println(userInput + " is a valid number!");
            break;
        }
        return 1;
    }

// TODO: Calculate the factorial of a number.
//  Prompt the user to enter an integer from 1 to 10.
//    Display the factorial of the number entered by the user.
//    Ask if the user wants to continue.
//    Use a for loop to calculate the factorial.
//    Assume that the user will enter an integer, but verify it’s between 1 and 10.
//    Use the long type to store the factorial.
//    Continue only if the user agrees to.

    public static int factorial(int min, int max){
        System.out.print("User, please enter a number from 1 to 10: ");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();




    }


}
