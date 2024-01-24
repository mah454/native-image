package ir.moke.ni;

import java.sql.*;

public class DbManager {
    private static final Connection connection;

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
            PreparedStatement preparedStatement = connection.prepareStatement("create table if not exists book(id int auto_increment,name varchar(255));");
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void insert(Book book) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into book(name) values (?);");
            preparedStatement.setString(1, book.name());
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static Book select() {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from book");
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                return new Book(id, name);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
