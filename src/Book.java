public class Book {
    private String title;
    private String author;
    private int pages;
    private float price;

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

    public void print() {
        System.out.print(author + ", ");
        System.out.print(title + ", ");
        System.out.print(pages + "p., ");
        System.out.println(price + " Eur");
    }

}
