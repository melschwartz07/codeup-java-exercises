public class StringExercise {
    public static void main (String[] args){

// TODO: For each of the following output examples: create a String variable that contains the desired output and
//  print it out to the console, you can do this with only one String variable and one print statement for each output example.

//  We don't need no education
//  We don't need no thought control

        String myStr = ("We don't need no education");
        System.out.println(myStr + "\n" + myStr.replace("education", "thought control"));

// Check "this" out!, "s inside of "s!

        String nextStr = ("Check \"this\" out!, \"s inside of \"s!");
        System.out.println(nextStr);

//        In windows, the main drive is usually C:\

        String thirdStr = ("In windows, the main drive is usually C:\\ ");
        System.out.println(thirdStr);

//        I can do backslashes \, double backslashes \\,
//        and the amazing triple backslash \\\!

        String lastStr = ("I can do backslashes \\, double backslashes \\\\,\n" +
                "and the amazing triple backslash \\\\\\!");
        System.out.println(lastStr);
    }
}
