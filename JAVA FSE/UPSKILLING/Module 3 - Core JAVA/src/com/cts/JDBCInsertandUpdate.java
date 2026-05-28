package src.com.cts;
import java.sql.*;
/* 32. Insert and Update Operations in JDBC
• Objective: Perform insert/update SQL queries from Java.
• Task: Add and modify student data using JDBC.
• Instructions:
o Create a StudentDAO class.
o Implement methods to insert new records and update student details.
o Use PreparedStatement for parameterized queries
*/
public class JDBCInsertandUpdate {
    public static void main(String[] args) {
        StudentDAOJdbc dao = new StudentDAOJdbc();
        dao.insertStudent(101, "Revanth", 21);
        dao.updateStudent(101, "Revanth Kumar", 22);
    }
}
class StudentDAOJdbc {
    String url = "jdbc:mysql://localhost:3306/studentdb";
    String username = "root";
    String password = "Root@123";
    public void insertStudent(int id, String name, int age) {
        String query = "INSERT INTO students (id, name, age) VALUES (?, ?, ?)";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.setInt(3, age);
            int rows = pstmt.executeUpdate();
            System.out.println(rows + " record inserted successfully.");
            con.close();
        } catch (Exception e) {
            System.out.println("Insert Error: " + e.getMessage());
        }
    }
    public void updateStudent(int id, String newName, int newAge) {
        String query = "UPDATE students SET name = ?, age = ? WHERE id = ?";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, newName);
            pstmt.setInt(2, newAge);
            pstmt.setInt(3, id);
            int rows = pstmt.executeUpdate();
            System.out.println(rows + " record updated successfully.");
            con.close();
        } catch (Exception e) {
            System.out.println("Update Error: " + e.getMessage());
        }
    }
}
/* In mySQL:
CREATE DATABASE studentdb;

USE studentdb;

CREATE TABLE students (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    age INT
);
 */
