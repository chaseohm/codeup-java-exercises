package movies;

public class Movie {

    private String name;
    private String category;

    public Movie(String name, String category){
        this.name = name;
        this.category = category;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String value){
        this.name = value;
    }

    public String getCategory(){
        return this.category;
    }
    public void setCategory(String value){
        this.category = value;
    }
}
