package ir.moke.ni;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Create book object");
        Book book = new Book(null, "Shahnameh");
        System.out.println("Create table on database");
        DbManager.createTable();
        System.out.println("Insert book");
        DbManager.insert(book);
        System.out.println("Select book");
        Book select = DbManager.select();
        System.out.println("Db object : " + select);
    }
}
