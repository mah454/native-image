package ir.moke.ni;

public class MainClass {
    public static void main(String[] args) {
        Book book = new Book(1, "Shahnameh");
        DbManager.createTable();
        DbManager.insert(book);
    }
}
