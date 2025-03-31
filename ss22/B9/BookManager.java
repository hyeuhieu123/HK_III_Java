package ss22.B9;

import java.io.*;
import java.util.*;

class Book implements Serializable {
    private int id;
    private String name;
    private String author;
    private String publisher;
    private double price;

    public Book(int id, String name, String author, String publisher, double price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
    public String getPublisher() { return publisher; }
    public void setPublisher(String publisher) { this.publisher = publisher; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", name='" + name + '\'' + ", author='" + author + '\'' + ", publisher='" + publisher + '\'' + ", price=" + price + '}';
    }
}

public class BookManager {
    private static final String FILE_NAME = "books.dat";
    private List<Book> listBook;

    public BookManager() {
        this.listBook = loadBooks();
    }

    public void addBook(Book book) {
        listBook.add(book);
        saveBooks();
    }

    public void updateBook(int id, String name, String author, String publisher, double price) {
        for (Book book : listBook) {
            if (book.getId() == id) {
                book.setName(name);
                book.setAuthor(author);
                book.setPublisher(publisher);
                book.setPrice(price);
                saveBooks();
                return;
            }
        }
        System.out.println("Không tìm thấy sách với ID: " + id);
    }

    public void deleteBook(int id) {
        listBook.removeIf(book -> book.getId() == id);
        saveBooks();
    }

    public void displayAllBooks() {
        listBook.forEach(System.out::println);
    }

    private void saveBooks() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(listBook);
        } catch (IOException e) {
            System.out.println("Lỗi khi lưu file: " + e.getMessage());
        }
    }

    private List<Book> loadBooks() {
        File file = new File(FILE_NAME);
        if (!file.exists()) return new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (List<Book>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Lỗi khi đọc file: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookManager manager = new BookManager();

        while (true) {
            System.out.println("Chọn chức năng: 1. Thêm 2. Cập nhật 3. Xóa 4. Hiển thị 5. Thoát");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập id, tên sách, tác giả, nhà xuất bản, giá:");
                    manager.addBook(new Book(Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine())));
                    break;
                case 2:
                    System.out.println("Nhập id sách cần sửa, tên mới, tác giả mới, NXB mới, giá mới:");
                    manager.updateBook(Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()));
                    break;
                case 3:
                    System.out.println("Nhập id sách cần xóa:");
                    manager.deleteBook(Integer.parseInt(sc.nextLine()));
                    break;
                case 4:
                    manager.displayAllBooks();
                    break;
                case 5:
                    sc.close();
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}
