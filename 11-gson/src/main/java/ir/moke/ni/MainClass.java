package ir.moke.ni;

import com.google.gson.Gson;

import java.util.List;

public class MainClass {
    private static final Gson gson = new Gson();

    public static void main(String[] args) {
        Book b1 = new Book("B1");
        Book b2 = new Book("B1");
        Book b3 = new Book("B1");
        Person person = new Person(1, "Mahdi", "Sheikh Hosseini", 38, List.of(b1, b2, b3));

        System.out.println(person);
        System.out.println(gson.toJson(person));
    }
}
