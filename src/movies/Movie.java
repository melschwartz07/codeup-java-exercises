package movies;

public class Movie {

// TODO: Create a class named Movie. It should have private fields for name and category, and a constructor that sets both of these.
//  Create methods to access these properties and change them (getters and setters).

    private String name;
    private String category;

    public Movie(String name, String category){
        this.name = name;
        this.category = category;
    }

    public String getName(){
        return name;
    }

    public String getCategory(){
        return category;
    }
}
