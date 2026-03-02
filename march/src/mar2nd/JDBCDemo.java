package mar2nd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo {

    public static void main(String[] args) {

        // Database credentials
        String url = "jdbc:mysql://localhost:3306/jdbcdb";
        String username = "root";
        String password = "root";

        try {
            // 1️⃣ Load Driver (Optional in newer versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2️⃣ Establish Connection
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connected Successfully!");

            // 3️⃣ Create Statement
            Statement stmt = con.createStatement();

            // 4️⃣ Create Table
            String createTable = "CREATE TABLE IF NOT EXISTS student (" +
                                 "id INT PRIMARY KEY, " +
                                 "name VARCHAR(50), " +
                                 "marks INT)";
            stmt.executeUpdate(createTable);
            System.out.println("Table Created!");

            // 5️⃣ Insert Data
            String insertQuery =
            	    "INSERT INTO student(name, marks) VALUES ('Ravi', 85)";
            stmt.executeUpdate(insertQuery);
            System.out.println("Data Inserted!");

            // 6️⃣ Execute SELECT Query
            String selectQuery = "SELECT * FROM student";
            ResultSet rs = stmt.executeQuery(selectQuery);

            // 7️⃣ Process Result
            System.out.println("\n--- Student Table ---");
            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " " +
                    rs.getString("name") + " " +
                    rs.getInt("marks")
                );
            }

            // 8️⃣ Close Resources
            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}