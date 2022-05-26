import java.util.Random;
public class ServerNameGenerator {
    public static String[] adj = {
            "fresh",
            "narrow",
            "outrageous",
            "helpful",
            "confused",
            "funny",
            "determined",
            "lucky",
            "glorious",
            "foolish"
    };

    public static String[] nouns = {
            "woman",
            "life",
            "child",
            "person",
            "team",
            "number",
            "car",
            "education",
            "service",
            "community"
    };

    public static int randomInt(int number){
        Random random = new Random();
        return random.nextInt(number);
    }

    public static String randomElement(String[] array){
        return array[randomInt(array.length)];
    }

    public static String generatedName(){
        return randomElement(adj) + "-" + randomElement(nouns);
    }


    public static void main(String[] args) {
        System.out.println(generatedName());


// TODO:
//  Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.
//  Create a method that will return a random element from an array of strings.
//  Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination and display the generated name to the user.
    }
}
