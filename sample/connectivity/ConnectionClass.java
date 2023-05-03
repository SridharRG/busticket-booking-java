package sample.connectivity;
import java.sql.*;
public class ConnectionClass {
public Connection connection;
    public Connection getConnection()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bus","root","Sridhar@79");

        } catch (SQLException e) {
            throw new RuntimeException("Cannot connect to database", e);
        }
        catch(ClassNotFoundException e) {
            System.out.println("null");
        }
        return connection;
    }
}
