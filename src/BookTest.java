public class BookTest {
    public static void main(String[] args) throws Exception {
        Book[] books = new Book[3];

        books[0] = new Book();
        books[0].setTitle("The Catcher in the Rye");
        books[0].setAuthor("J.D. Salinger");
        books[0].setPages(234);
        books[0].setPrice(19.99f);

        books[2] = new Book();
        books[2].setTitle("The Great Gatsby");
        books[2].setAuthor("F. Scott Fitzgerald");
        books[2].setPages(180);
        books[2].setPrice(14.99f);

    }
}
