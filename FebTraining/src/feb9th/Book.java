package feb9th;

class Book {
    private String title;
    private boolean isIssued;

    Book(String title) {
        this.setTitle(title);
    }

    void issueBook() {
        if (!isIssued) {
            isIssued = true;
            System.out.println("Book Issued");
        } else {
            System.out.println("Already Issued");
        }
    }

    void returnBook() {
        isIssued = false;
        System.out.println("Book Returned");
    }

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
