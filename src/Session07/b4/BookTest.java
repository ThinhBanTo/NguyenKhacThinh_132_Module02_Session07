package Session07.b4;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book();
        book.getTitle("Java Backend");
        book.getAuthor("Nguyễn Duy Quang");
        book.getPrice(150000);

        book.printInfo();
    }
}
