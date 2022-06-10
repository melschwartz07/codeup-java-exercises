package grades;
import java.util.ArrayList;

//TODO: Create a class named Student. It should have private properties for the student's name, and grades.
// The grades property should be an ArrayList of integers. The student class should have a constructor that sets
// name property, and initializes the grades property as an empty ArrayList.

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name1){
        this.name = name1;
        this.grades = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public double getGradeAverage(){
        double sum = 0;
        for (int grade : this.grades) {
            sum += grade;
        }
        return sum / this.grades.size();
    }

}