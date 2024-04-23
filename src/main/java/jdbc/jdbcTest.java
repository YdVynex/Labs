package jdbc;

import java.sql.*;

import static java.sql.DriverManager.getConnection;

public class jdbcTest {
    public static void main(String[] args) throws SQLException {
        Connection connection = getConnection("jdbc:mysql://localhost:3306/pubs", "root", "");
        Statement statement = connection.createStatement();
        ResultSet resultSet =
                statement.executeQuery("SELECT * FROM employees");

        while (resultSet.next()) {
            String name = resultSet.getString("fname");

            System.out.println(name);
        }
        statement.close();
        connection.close();
    }
}
