public class Person{

    private String name;

    public Person(String name){
        setName(name);
    }

    public String getName(){
//TODO: return the person's name
        return this.name;
    }

    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.printf("hey, whatsup %s?", name);
    }

    public static void main(String[] args){
        Person person = new Person("Mel");
        System.out.println(person.getName());
        person.sayHello();
        System.out.print("\n");

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

        //first method shows person1 and person2 match = true
        //second method is false bc "==" cannot be used to return a string. have to use the .equals() method.

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

        //returns true bc you are comparing two variables that are the same rather than strings. == works here

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        //the setName() method takes over once it is declared
        //at first prints John John, then Jane Jane

    }
}