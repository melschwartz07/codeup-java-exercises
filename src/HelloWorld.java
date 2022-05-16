public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello, World!");

//      TODO: Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
        int myFavoriteNumber = 7;
        System.out.println("My favorite number is: " + myFavoriteNumber);

//      TODO: Create a String variable named myString and assign a string value to it, then print the variable out to the console.
        String myString = "Here's a string: ";
        System.out.println(myString);

//      TODO: Change your code to assign a character value to myString. What do you notice?

        myString += 'c';
        System.out.println(myString);
        // adds 'c' to existing string that was declared above.

//      TODO: Change your code to assign the value 3.14159 to myString. What happens?

        myString += 3.14159;
        System.out.println(myString);
        // adds value to existing strings stated above.

//      TODO: Declare a long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?

//        long myNumber;
//        System.out.println(myNumber);
        // code does not run because myNumber does not have an assigned value

//       TODO: Change your code to assign the value 3.14 to myNumber. What do you notice?

//        long myNumber = 3.14;
//        System.out.println(myNumber);
        //code will not run because "long" is not the appropriate data type to assign

//       TODO: Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.

//        long myNumber = 123L;
//        System.out.println(myNumber);
        //The long value will run "123", but L is not registered because it is not a number.

//      TODO: Change your code to assign the value 123 to myNumber. Why does assigning the value 3.14 to a variable
//       declared as a long not compile, but assigning an integer value does?

//        long myNumber = 123;
//        System.out.println(myNumber);
        // the appropriate assignment for 3.14 would be to assign "double" bc of the decimal value. This has to do with
        // the distinction between the amount of bit space for the variable that you are assigning.

//      TODO: Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?

//        float myNumber = 3.14;
//        System.out.println(myNumber);
        //use double
        // add more decimal points to 3.14

//      TODO: Copy and paste the following code blocks one at a time and execute them

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

        int x = 5;
        System.out.println(++x);
        System.out.println(x);

//        What is the difference between the above code blocks? Explain why the code outputs what it does.
        // in the first code block, you are incrementing the initial assignment of x
        //in the second code block, your starting point when printed is the value of x + 1;

//      TODO: Try to create a variable named class. What happens?
        // class is reserved and cannot be used as a variable

//      TODO: Object is the most generic type in Java. You can assign any value to a variable of type Object.
//      What do you think will happen when the following code is run?

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;


//        int three = (int) "three";
        // cannot run because you cant conver a string into int

//        TODO: Rewrite the following expressions using the relevant shorthand assignment operators:

//         int x = 4;
//         x = x + 5;

        int s = 4;
        s += 5;
        System.out.println(s);

//         int x = 3;
//         int y = 4;
//         y = y * x;

        int t = 3;
        int u = 4;
        u *= t;
        System.out.println(u);

//        int x = 10;
//        int y = 2;
//        x = x / y;
//        y = y - x;

        int v = 10;
        int w = 2;
        v /= w;
        w -= v;
        System.out.println(v);
        System.out.println(w);

//      TODO:  What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold?
//       What happens if you increment a numeric variable past the type's capacity?
//       Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type.

        int num = 2147483647;
        System.out.println(num);
        num++;
        System.out.println(num);
        System.out.println(Integer.MAX_VALUE);
        //the max number will reset to the lowest number that the value can hold.
    }
}



