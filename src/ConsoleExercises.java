import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args){

// TODO: Copy this code into your main method:
//  double pi = 3.14159;
//  Write some Java code that uses the variable pi to output the following:
//  The value of pi is approximately 3.14.
//  Don't change the value of the variable; instead, reference one of the links above and use System.out.format to accomplish this.

        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f\n", pi);
        //%.2f crucial thing to remember for amount of decimal points

// TODO: Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
//  What happens if you input something that is not an integer?
        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter an integer: ");
//        int userInput = scanner.nextInt();
//
//        System.out.println("User entered " + userInput + "!");

        //the code will not run if there is something other than an integer inputted.

// TODO: Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
//  What happens if you enter less than 3 words?
//  What happens if you enter more than 3 words?

//        System.out.println("Enter 3 different words: ");
//        String one = scanner.next();
//        String two = scanner.next();
//        String three = scanner.next();
//
//        System.out.printf("%s\n%s\n%s\n", one, two, three);

        //You will always be prompted for 3 words, so the program will continue asking until this is satisfied
        //You will not be able to enter more than 3 words because the program will stop

// TODO: Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
//  do you capture all the words?

//        System.out.println("Enter a sentence: ");
//        String string = scanner.next();
//
//        System.out.println(string);

        //It does not catch all of the words, only the first word of the sentence. when nextLine() is used, it displays the sentence

// TODO: Rewrite the above example using the nextLine method.
//        System.out.println("Enter a sentence: ");
//        String sentence = scanner.nextLine();

//        System.out.println("Enter a sentence: ");
//        String string = scanner.nextLine();
//
//        System.out.println(string);

// TODO: Prompt the user to enter values of length and width of a classroom at Codeup (or your room if virtual).
//  Use the nextLine method each time you need to get user input. In this case, we need it twice, once to get the user
//  input for the length and again to get the user input for the width. Parse the resulting strings to a numeric type.
//  Assume that the rooms are perfect rectangles.
//  Assume that the user will enter valid numeric data for length and width.

//        System.out.println("Enter the dimensions of your room: ");
//        int length = scanner.nextInt();
//        int width = scanner.nextInt();
//
//        System.out.printf("The area of the room is %d", (length * width));

// TODO: Display the area and perimeter of that classroom.
//  The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.
        System.out.println("Enter the dimensions of your room: ");
        int length = scanner.nextInt();
        int width = scanner.nextInt();

        System.out.printf("The area of the room is %d ft.\n", (length * width));
        System.out.printf("The perimeter of the room is %d ft.", ((length * 2) + (width * 2)));


    }
}
