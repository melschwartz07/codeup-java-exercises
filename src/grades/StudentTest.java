package grades;

//TODO: Test your Student class by creating a StudentTest class, adding a main method and creating Student objects.
// Verify that you can add grades to each object, and that your getGradeAverage method correctly returns the average
// of the student's grades.

public class StudentTest {
    public static void main(String[] args) {
        Student mel = new Student("Melanie");
        Student fred = new Student("Fred");
        mel.addGrade(87);
        mel.addGrade(82);
        mel.addGrade(93);
        fred.addGrade(75);
        fred.addGrade(84);
        fred.addGrade(88);
        fred.addGrade(73);

        System.out.println("Melanie average: " + mel.getGradeAverage());
        System.out.println("Fred average: " + fred.getGradeAverage());
    }
}