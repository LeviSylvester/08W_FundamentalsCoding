package W3_Library;

public class Book {
    private String name;
    private int numberOfPages;
    private double rating;
    private String authors;//should be array, getter, setter and at constructor

    public String getName(){
        return name;
    }
    public int getNumberOfPages(){
        return numberOfPages;
    }
    public double getRating(){
        return rating;
    }
    public String getAuthors(){
        return authors;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setNumberOfPages(int pages){
        this.numberOfPages = numberOfPages;
    }
    public void setRating(double rating){
        this.rating = rating;
    }
    public void setAuthors(String authors){
        this.authors = authors;
    }

    Book() {
    }

    Book(String name, int numberOfPAges, double rating, String authors) {
        this.name = name;
        this.numberOfPages = numberOfPAges;
        this.rating = rating;
        this.authors = authors;
    }
    @Override
    public String toString(){
        String myBook = "(" + name + ", " + numberOfPages + ", " + rating + ", " + authors + ")";
        return myBook;
    }
}
