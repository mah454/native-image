package ir.moke.ni;

import java.util.List;

public record Person(long id, String Name, String family, Integer age, List<Book> book) {

}
