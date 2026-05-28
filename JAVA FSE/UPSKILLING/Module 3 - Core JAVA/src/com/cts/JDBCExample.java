package src.com.cts;
import java.sql.*;
/*31. Basic JDBC Connection
• Objective: Connect Java with a relational database.
• Task: Connect to a local MySQL/SQLite database and retrieve data.
• Instructions:
o Set up a database with a students table.
o Write code to load the JDBC driver, create a connection, execute a SELECT query, and
print results.
*/
public class JDBCExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/studentdb";
        String username = "root";
        String password = "Root@123";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Database Connected Successfully!");

            // Create Statement
            Statement stmt = con.createStatement();

            // Execute SELECT Query
            String query = "SELECT * FROM students";
            ResultSet rs = stmt.executeQuery(query);
            System.out.println("\nStudent Details:");
            System.out.println("-------------------------");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");

                System.out.println(
                        "ID: " + id +
                                ", Name: " + name +
                                ", Age: " + age
                );
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
/* In mysql workbench:
CREATE DATABASE studentdb;

USE studentdb;

CREATE TABLE students (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    age INT
);

INSERT INTO students VALUES
(1, 'Revanth', 21),
(2, 'Arun', 20),
(3, 'Kavin', 22);
 */
