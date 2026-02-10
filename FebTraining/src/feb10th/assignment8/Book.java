package feb10th.assignment8;

public class Book {
    private String title;
    private boolean issued;

    public Book(String title) {
        this.title = title;
    }

    public void issueBook() throws Exception {
        if (issued)
            throw new Exception("Book already issued");
        issued = true;
        System.out.println(title + " issued");
    }

    public void returnBook() {
        issued = false;
        System.out.println(title + " returned");
    }

    public String getTitle() {
        return title;
    }
}
