package movies;

import java.util.Scanner;

public class MoviesApplication {

// TODO:    Give the user a list of options for viewing all the movies or viewing movies by category.
//    Use your Input class to get input from the user, and display information based on their choice. (Remember to import your Input class)
//    If a category is selected, only movies from that category should be displayed.
//    Your application should continue to run until the user chooses to exit.
//    Sample Output
//
//
//    What would you like to do?
//
//            0 - exit
//1 - view all movies
//2 - view movies in the animated category
//3 - view movies in the drama category
//4 - view movies in the horror category
//5 - view movies in the scifi category
//
//    Enter your choice: 1
//
//    Frankenstein -- horror
//    Goodfellas -- drama
//    Pulp Fiction -- drama

    public static Scanner input  = new Scanner(System.in);

    private static void showOptions(){
        System.out.printf("What would you like to do?%n");
        System.out.printf("0 - exit%n");
        System.out.printf("1 - View all movies%n");
        System.out.printf("2 - View movies in the animated category%n");
        System.out.printf("3 - View movies in the drama category%n");
        System.out.printf("4 - View movies in horror category%n");
        System.out.printf("5 - View movies in sci fi category%n");
    }

    private static int chooseOption(){
        System.out.printf("Enter your choice: %n");
        return input.nextInt(16);

    }

    private static void selectOption(int num) {
        switch (num) {
            case 0:
                System.out.print("Exit");
                break;

            case 1:
                showAll();
                break;
            case 2:
                showCat("animated");
                break;
            case 3:
                showCat("drama");
                break;
            case 4:
                showCat("horror");
                break;
            case 5:
                showCat("scifi");
                break;
            default:
                System.out.println("try again");
                break;
        }
    }

    private static Movie[] getAllMovies(){
        return MoviesArray.findAll();
    }

    private static void showAll(){
        for(Movie movie : getAllMovies()){
            System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
        }
    }

    private static void showCat(String categoryName){
        for (Movie movie : getAllMovies()){
            if(movie.getCategory().equalsIgnoreCase(categoryName)){
                System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
            }
        }
        System.out.println();
    }

    private static void runSearch() {
        showOptions();
        selectOption(chooseOption());
    }

    public static void main(String[] args){
        runSearch();
    }
}
