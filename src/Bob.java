import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {

// TODO: Bob is a lackadaisical teenager. In conversation, his responses are very limited.
//  Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
//        He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
//        He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
//        He answers 'Whatever.' to anything else.
//        Write the Java code necessary so that a user of your command line application can have a conversation with Bob.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, I'm Bob.");
        String userInput;

        do {
            userInput = scanner.nextLine();
            if (userInput.endsWith("?")) {
                System.out.println("sure.");
            } else if (userInput.endsWith("!")) {
                System.out.println("whoa, chill out.");
            } else if (userInput.equals("")) {
                System.out.println("fine, be that way.");
            } else {
                System.out.println("whatever");
            }
            System.out.println("userInput before conditional: " + userInput);
        } while (userInput == "bye");
        {

            System.out.println("finally. bye.");


        }


    }
}
