public class BookTest {
    public static void main(String[] args) throws Exception {
        Book[] books = new Book[3];

        books[0] = new Book("The Catcher in the Rye", "J.D. Salinger", 234);
        books[0].setPrice(19.90f);

        books[1] = new Book("The Great Gatsby", "F. Scott Fitzgerald", 180);
        books[1].setPrice(14.99f);

        books[2] = new Book();
        books[2] = null;

        System.out.println("Anzahl Bücher: " + Book.getCntBooks());
        BookTest.printBooks(books);
    }

    public static void printBooks(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
    }
}
