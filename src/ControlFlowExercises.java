import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {


// TODO: While Create an integer variable i with a value of 5.
//    Create a while loop that runs so long as i is less than or equal to 15
//    Each loop iteration, output the current value of i, then increment i by one.
//    Your output should look like this:
//    5 6 7 8 9 10 11 12 13 14 15

//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i + " ");
//            i++;
//        }

// TODO: Do While
//  Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//  Alter your loop to count backwards by 5's from 100 to -10.
//  Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal: 2, 4, 16, 256, 65536

//        int j = 2;
//        do {
//            System.out.println(j + " ");
//            j = (int) Math.pow(j, 2);
//        } while (j < 1000000);


// TODO: Refactor the previous two exercises to use a for loop instead.

//        for (int i = 5; i <= 15; i++) {
//            System.out.println(i + " ");
//        }
//
//        for (int j = 2; j <= 1000000; j *= j){ ️
//            System.out.println(j);
//        }

// TODO: Fizzbuzz
//  One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory,
//  the test is designed to assess basic looping and conditional logic skills.
//  Write a program that prints the numbers from 1 to 100.
//        For multiples of three: print “Fizz” instead of the number.
//        For the multiples of five: print “Buzz”.
//        For numbers which are multiples of both three and five: print “FizzBuzz”.

//    for (int i = 1; i <= 100; i++){
//        if(((i % 5) ==0) && ((i % 7) == 0))
//            System.out.println("fizzbuzz");
//        else if ((i % 5) == 0)
//            System.out.println("fizz");
//        else if ((i % 7) == 0)
//            System.out.println("buzz");
//        else
//            System.out.println(i);
//    }


    // TODO: Display a table of powers
        //  Prompt the user to enter an integer.
//        Display a table of squares and cubes from 1 to the value entered.
//        Ask if the user wants to continue.
//        Assume that the user will enter valid data.
//        Only continue if the user agrees to.

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter an integer: ");
//        int userInput = scanner.nextInt();
//        System.out.println("Here is your table!");
//        System.out.println("number | Squared | cubed");
//        System.out.println("------ | ------- | -----");
//
//        for (int i = 0; i <= userInput; i++){
//            System.out.printf("\t%s\t|\t%s\t|\t%s\t\n", i, (int) (i*i), (int) ((i*i) * i));
//        }


        // TODO: Convert given number grades into letter grades.
//  Prompt the user for a numerical grade from 0 to 100.
//        Display the corresponding letter grade.
//                Prompt the user to continue.
//        Assume that the user will enter valid integers for the grades.
//        The application should only continue if the user agrees to.
//        Grade Ranges:
//        A : 100 - 88
//        B : 87 - 80
//        C : 79 - 67
//        D : 66 - 60
//        F : 59 - 0

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your numerical grade: ");
        int grade = scanner.nextInt();


            if (grade >= 88)
                System.out.println("You got an A");
            else if (grade >= 80 && grade < 88)
                System.out.println("You got a B");
            else if (grade >= 67 && grade < 80)
                System.out.println("You got a C");
            else if (grade >= 60 && grade < 67)
                System.out.println("You got a D");
            else
                System.out.println("Sorry, you got an F");
    }
}
