package src.com.cts;
import java.sql.*;
/*33. Transaction Handling in JDBC
• Objective: Use JDBC transactions.
• Task: Simulate a money transfer between two accounts.
• Instructions:
o Create accounts table with balances.
o Implement a transfer method with Connection.setAutoCommit(false).
o Commit if both debit and credit succeed, else rollback.
*/
public class PublicTranasactionExample {
    static final String URL = "jdbc:mysql://localhost:3306/bankdb";
    static final String USER = "root";
    static final String PASSWORD = "Root@123";
    public static void transferMoney(
            int fromAccount,
            int toAccount,
            double amount) {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                    URL, USER, PASSWORD);
            con.setAutoCommit(false);
            String debitQuery = "UPDATE accounts SET balance = balance - ? WHERE id = ?";
            PreparedStatement debitStmt = con.prepareStatement(debitQuery);
            debitStmt.setDouble(1, amount);
            debitStmt.setInt(2, fromAccount);

            int debitRows = debitStmt.executeUpdate();
            String creditQuery = "UPDATE accounts SET balance = balance + ? WHERE id = ?";

            PreparedStatement creditStmt = con.prepareStatement(creditQuery);

            creditStmt.setDouble(1, amount);
            creditStmt.setInt(2, toAccount);

            int creditRows = creditStmt.executeUpdate();
            if (debitRows > 0 && creditRows > 0) {
                con.commit();
                System.out.println(
                        "Transaction completed successfully.");
            } else{
                con.rollback();
                System.out.println(
                        "Transaction failed. Rolled back.");
            }
        } catch (Exception e){
            try {
                if (con != null) {
                    con.rollback();
                    System.out.println(
                            "Transaction rolled back.");
                }
            } catch (Exception rollbackEx) {
                System.out.println(
                        "Rollback Error: " +
                                rollbackEx.getMessage());
            }
            System.out.println(
                    "Error: " + e.getMessage());
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(
                        "Connection Close Error: " +
                                e.getMessage());
            }
        }
    }
    public static void main(String[] args) {
        transferMoney(1, 2, 1000);
    }
}
/* In Mysql Workbench:
CREATE DATABASE bankdb;

USE bankdb;

CREATE TABLE accounts (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    balance DOUBLE
);

INSERT INTO accounts VALUES
(1, 'Revanth', 5000),
(2, 'Arun', 3000);
 */