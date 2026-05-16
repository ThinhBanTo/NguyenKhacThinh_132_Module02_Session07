package Session07.lyThuyet;

import java.util.Scanner;

public class Book {
    //1:
    private String bookId;
    private String bookName;
    private double price_in;
    private double price_out;
    private double profit;
    private String author;
    private boolean status;

    //2:
    //2.1: khong tham so

    public Book() {
    }
    //2.2: day du tham so

    public Book(boolean status, String author, double profit, double price_out, double price_in, String bookName, String bookId) {
        this.status = status;
        this.author = author;
        this.profit = profit;
        this.price_out = price_out;
        this.price_in = price_in;
        this.bookName = bookName;
        this.bookId = bookId;
    }

    //3:
    //3.1: getter/setter


    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getPrice_in() {
        return price_in;
    }

    public void setPrice_in(double price_in) {
        this.price_in = price_in;
    }

    public double getPrice_out() {
        return price_out;
    }

    public void setPrice_out(double price_out) {
        this.price_out = price_out;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //3.2: Behavior methods:
    public void inputData(Scanner scanner) {
        System.out.println("Nhập thông tin của sách:");
        System.out.print("Mã sách: ");
        this.bookId = scanner.nextLine();
        System.out.print("Tên sách: ");
        this.bookName = scanner.nextLine();
        System.out.print("Giá nhập vào: ");
        this.price_in = Double.parseDouble(scanner.nextLine());
        System.out.print("Giá bán ra: ");
        this.price_out = Double.parseDouble(scanner.nextLine());
        System.out.print("Tác giả: ");
        this.author = scanner.nextLine();
        System.out.println("Trạng thái: ");
        this.status = Boolean.parseBoolean(scanner.nextLine());
    }
    public void showData() {
        System.out.println("Thông tin của sách:");
        System.out.println("Mã sách: "+this.bookId);
        System.out.println("Tên sách: "+this.bookName);
        System.out.println("Giá nhập vào: "+this.price_in);
        System.out.println("Giá bán ra: "+this.price_out);
        this.profit=this.price_out-this.price_in;
        System.out.println("Lợi nhuận: "+this.profit);
        System.out.println("Tác giả: "+this.author);
        System.out.println("Trạng thái: "+this.status);
    }
}
