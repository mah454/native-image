package ir.moke.ni;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

    private static final Gson gson = new Gson();
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(1,"Mahdi","Jalali"));
        personList.add(new Person(2,"Parisa","Mohammadi"));
        personList.add(new Person(3,"Shiva","Vaziri"));
        personList.add(new Person(4,"Sina","Hosseini"));
        personList.stream().map(gson::toJson).forEach(System.out::println);
    }
}
