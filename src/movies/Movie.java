package movies;

public class Movie {

    private String name;
    private String category;

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }
    // Default Constructor
    public Movie() {
    }

    // Name & Category constructor
    public Movie(String name, String category){
        this.name = name;
        this.category = category;
    }

}
