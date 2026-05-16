package Session07.b4;

public class Book {
    //
    private String title;
    private String author;
    private double price;
    //
    public String getTitle(String javaBackend) {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor(String nguyễnDuyQuang) {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice(int i) {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    //
    public void printInfo() {
        System.out.println("Thông tin của quyển sách:");
        System.out.println("Tiêu đề: "+this.title);
        System.out.println("Tác giả: "+this.author);
        System.out.println("Giá: "+this.price+" VNĐ");
    }
}
