package ir.moke.ni;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbManager {

    private static Connection connection;

    static {
        try {
            Class.forName("org.h2.Driver");
            connection = DriverManager.getConnection("jdbc:h2:mem:sample");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void createTable() {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("create table if not exists book(id int,name varchar(255));");
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void insert(Book book) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into book(id,name) values (?,?);");
            preparedStatement.setInt(1,book.id());
            preparedStatement.setString(2,book.name());
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
