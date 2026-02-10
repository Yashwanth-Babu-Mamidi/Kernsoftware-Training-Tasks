package feb10th.assignment8;

import java.util.*;

public class LibraryApp {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        books.add(new Book("Java Basics"));
        books.add(new Book("OOPS Concepts"));

        try {
            books.get(0).issueBook();
            books.get(0).issueBook(); // exception
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Sort books by title (BONUS)
        books.sort(Comparator.comparing(Book::getTitle));
        books.forEach(b -> System.out.println(b.getTitle()));
    }
}
