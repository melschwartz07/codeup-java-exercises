package grades;
// TODO: Create a map for students and GitHub usernames
//  Create a class named GradesApplication with a main method. Inside the main method, create a HashMap named students.
//  It should have keys that are strings that represent github usernames, and values that are Student objects.
//  Create at least 4 Student objects with at least 3 grades each, and add them to the map.

import util.Input;
import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Student mel = new Student("Melanie");
        Student fred = new Student("Fred");
        Student trevor = new Student("Trevor");
        Student chelsea = new Student("Chelsea");

        mel.addGrade(90);
        mel.addGrade(50);
        mel.addGrade(90);
        fred.addGrade(100);
        fred.addGrade(99);
        fred.addGrade(99);
        fred.addGrade(100);
        trevor.addGrade(62);
        trevor.addGrade(74);
        trevor.addGrade(88);
        chelsea.addGrade(100);
        chelsea.addGrade(92);
        chelsea.addGrade(88);

        students.put("melschwartz07 | ", mel);
        students.put(" fredhenry10 | ", fred);
        students.put(" trev22 | ", trevor);
        students.put(" chels18 | ", chelsea);

        cli(students);
    }

    public static void cli(HashMap<String,Student> students){
        Input input = new Input();
        System.out.println("Welcome!\n" +
                "\n" +
                "Here are the GitHub usernames of our students:");

        for (String ghUser : students.keySet()) {
            System.out.print(ghUser + " ");
        }
        do {

            System.out.println();
            System.out.println("What student would you like to see more information on?");
            String in = input.getString();

            if (students.containsKey(in)) {
                System.out.printf("Name: %s - GitHub Username: %s\n" +
                                "Current Average: %f\n",
                        students.get(in).getName(),
                        in,
                        students.get(in).getGradeAverage());
            } else {
                System.err.println("Sorry, no student found with the GitHub keyTyped of " + in);
            }
        } while (input.yesNo("Would you like to see another student? Y/N"));
        System.out.println("Goodbye, and have a wonderful day!");

    }
}