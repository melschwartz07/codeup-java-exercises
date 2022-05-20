import java.util.Arrays;
public class ArrayExercises {


// TODO: Create a class inside of src named ArraysExercises. Create a main method for this class to do your work.
//  What happens when you run the following code? Why is Arrays.toString necessary?

    public static void main(String[] args){
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

// TODO: Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element.
//  Iterate through the array and print out the name of each person in the array.
//  Create a static method named addPerson. It should accept an array of Person objects, as well as a single person
//  object to add to the passed array. It should return an array whose length is 1 greater than the passed array,
//  with the passed person object at the end of the array.

        Person[] names = new Person[3];

        names[1] = new Person("Mel");
        names[2] = new Person("Carlos");
        names[3] = new Person("Fred");

        for (Person person: names){
            System.out.println(person.getName());
        }
        System.out.println(names.length);
    }

}
