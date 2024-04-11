public class Book {
    private String title;
    private String author;
    private int pages;
    private float price;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;

    }

    public Book() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String toString() {
        return author + ", " + title + ", " + pages + "p., " + price + " Eur";
    }

}
