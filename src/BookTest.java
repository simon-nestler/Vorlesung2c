public class BookTest {
    public static void main(String[] args) throws Exception {
        Book[] books = new Book[3];

        books[0] = new Book();
        books[0].setTitle("The Catcher in the Rye");
        books[0].setAuthor("J.D. Salinger");
        books[0].setPages(234);
        books[0].setPrice(19.90f);

        books[1] = new Book();
        books[1].setTitle("The Great Gatsby");
        books[1].setAuthor("F. Scott Fitzgerald");
        books[1].setPages(180);
        books[1].setPrice(14.99f);

        BookTest.printBooks(books);

    }

    public static void printBooks(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.print(books[i].getAuthor() + ", ");
                System.out.print(books[i].getTitle() + ", ");
                System.out.print(books[i].getPages() + "p., ");
                System.out.println(books[i].getPrice() + " Eur");
            }

        }
    }
}
