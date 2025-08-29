import java.sql.*;

public class SimpleJDBC {
    public static void main(String[] args) throws Exception {
        /*
         1. Import package
         2. Load and register JDBC driver
         3. Establish a connection
         4. Create a statement
         5. Execute a query
         6. Process the result set
         7. Close the connection
         */

        final String url = "jdbc:postgresql://localhost:5433/postgres";
        final String userName = "postgres";
        final String password = "";
        final String sql = "INSERT INTO students VALUES(?, ?, ?, ?, ?)";

        Connection connection = DriverManager.getConnection(url, userName, password);

        PreparedStatement statement = connection.prepareStatement(sql);

        Date enrollment_dae = Date.valueOf("2025-11-03");

        statement.setInt(1, 3);
        statement.setString(2, "Saw");
        statement.setString(3, "John");
        statement.setString(4, "saw@example.com");
        statement.setDate(5, enrollment_dae);

        statement.execute();

        connection.close();
    }
}
