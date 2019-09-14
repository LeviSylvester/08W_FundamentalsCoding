package W3_Library;

import java.util.*;

/*In acest exercitiu vom vrea o biblioteca. Vom manipula o clasa Author care va avea
nume, email, gender si numar de telefon. Toate fieldurile se vor instantia in constructor si vom avea
public setters and getters pt fiecare field, precum si o metoda toString care
sa returneze formatat reprezantarea string a obiectului
(ex: "Author[name=Tan Ah Teck,email=ahTeck@somewhere.com,gender=m]").
  Pe langa Author vom avea si Book care va avea ca state
name, numberOfPages, rating si mai multi autori. La fel ca la clasa anterioara vom aveam
public setters and getters si initializarea stateului obiectelor se va face in constructor.
  Prin input de la user Se cere sa putem :
  a) Adauga autori
  b) Adauga carti cu autori existenti deja in memoria (array/arrayloist)
  c) [Sterge autori]/afiseaza autori
  d) [sterge carti]/afiseaza carti
  e) [sa cautam carti dupa autori]/exit
  [f) sa cautam cartea cea mai bine cotata(cel mai mare rating) a unui autor.]*/
public class Main {
    public static void main(String[] args) {
//        Author[] authors = new Author[10];
//        Book[] books = new Book[10];
//        int authorIndex = 0;
//        int bookIndex = 0;
        List<Author> authors = new ArrayList<>();
        List<Book> books = new ArrayList<>();

        List<String> authorNames = new ArrayList<>();
        List<Double> bookRatings = new ArrayList<>();

        Utils utils = new Utils();
        Scanner in = new Scanner(System.in);

        Author author = new Author();
        Book book = new Book();

        boolean stayInLoop = true;
        while (stayInLoop) {
            utils.listOptions();
            while (!in.hasNext("[a-h]")) {
                System.out.println("not a valid option");
                in.next().charAt(0);
            }
            char input = in.next().charAt(0);
            switch (input) {
                case 'a':
                    System.out.println("Enter author's name:");
                    author.setName(in.next());//construct input name (so it accepts spaces between words)
                    System.out.println("Enter author's email:");
                    author.setEmail(in.next());
                    System.out.println("Enter author's gender:");
                    author.setGender(in.next());
                    System.out.println("Enter author's tel:");
                    author.setTel(in.next());
                    Author myAuthor = new Author(author.getName(), author.getEmail(), author.getGender(), author.getTel());
//                    authors.add(author);//haven't figured it out yet why doesn't it work (adds/displays same element)
                    authors.add(myAuthor);
                    authorNames.add(author.getName());
//                    authors[authorIndex] = myAuthor;
//                    authorIndex++;
                    break;
                case 'b':
                    System.out.println("Enter book's name:");
                    book.setName(in.next());
                    System.out.println("Enter book's number of pages:");
                    book.setNumberOfPages(in.nextInt());
                    System.out.println("Enter book's rating");
                    book.setRating(in.nextDouble());
                    System.out.println("Enter book's author(s):");
                    book.setAuthors(in.next());//here should be array
                    Book myBook = new Book(book.getName(), book.getNumberOfPages(), book.getRating(), book.getAuthors());
//                    books.add(book);//haven't figured it out yet why doesn't it work (adds/displays same element)
                    books.add(myBook);
                    bookRatings.add(book.getRating());
//                    books[bookIndex] = myBook;
//                    bookIndex++;
                    break;
                case 'c':
                    System.out.println("Which author would you like to erase:");
                    for (Author a : authors) {
                        System.out.println(a);
                    }
//                    for (String a : authorNames) {
//                        System.out.println(a);
//                    }
                    String name = in.next();
//                    System.out.println(authorNames.indexOf(name));
                    int nameIndex = authorNames.indexOf(name);
                    authorNames.remove(nameIndex);
                    authors.remove(nameIndex);
                    authors.get(nameIndex);
                    System.out.println(authors(1));

//                    for (String a : authorNames) {
//                        System.out.println(a);
//                    }
                    for (Author a : authors) {
                        System.out.println(a);
                    }
                    break;
                case 'd':
                    //code =remove book=
                    break;
                case 'e':
                    System.out.println("We currently have the following authors:");
//                    for (int i = 0; i<authorIndex; i++) {
//                        System.out.println(authors[i]);
//                    }
                    for (Author a : authors) {
                        System.out.println(a);
                    }
                    break;
                case 'f':
                    System.out.println("We currently have the following books");
                    for (Book b : books) {
                        System.out.println(b);
                    }
                    break;
                case 'g':
                    System.out.println("Book with the highest rating is: ");
                    //display max by index
                    //display object on that index
//                    double bestRating = Collections.max(bookRatings);
//                    System.out.println(bestRating);
//                    authors.remove(nameIndex);

//                    System.out.println("List: " + arr);
                    // element at index 2
                    int bestRatingIndex = bookRatings.indexOf(Collections.max(bookRatings));
                    System.out.println(books.get(bestRatingIndex));

//                    System.out.println("the element at index 2 is " + element);
//
//                    System.out.println("Max rating is: " + Collections.max(bookRatings));
                    break;
                case 'h':
                    System.out.println("you opted to exit");
                    stayInLoop = false;
                    break;
                /*another case is to get the highest rating: program a method that
                builds a list from book's object-list's rating (while i <= index, adds to list)
                and finds maximum value (tests for each element),
                then displays by index that object*/
                //another case to display authors details by an input name
                //another case would be to display all authors
            }
        }
    }
}


