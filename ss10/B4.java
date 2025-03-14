package ss10;

class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("ko hop le");
            return;
        } else {
            this.price = price;
        }
    }


}

public class B4 {
    public static void main(String[] args) {
        Book book = new Book("day lap trinh", "hieu", 50.0);

        System.out.println("ten sach" + book.getTitle());
        System.out.println("tac gia" + book.getAuthor());
        System.out.println("gia tien" + book.getPrice());

        book.setPrice(100);
        System.out.println("sau khi cap nhat" + book.getPrice());
    }
}