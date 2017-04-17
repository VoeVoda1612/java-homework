package Task3;


public class Main {
    public static void main(String[] args) {
        Book book=new Book("Герберт Шилдт","Java 8 Полное руководство","...");
        book.show();

        book.setAuthor("Брюс Эккель");
        book.setTitle("Философия JAVA");
        book.show();
    }
}
