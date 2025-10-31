/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;

import java.io.File;
import java.sql.*;
import java.util.ArrayList;
import model.Student;

/**
 *
 * @author darhlilove
 */
public class DatabaseConnector {

    // DB_URL = "jdbc:<database>://ip_address:port/database_name";
    static final String DB_URL = "jdbc:mysql://localhost:3306/userdb";
    static final String DB_USERNAME = "root";
    static final String DB_PASSWORD = "my-secret-pw";

    // Create a connection
    // CRUD Operations
    // CRUD Operations on Database
    // C - Create: Inserting data into the database
    public static void addUser(Student user) throws SQLException {
        try ( // Create a connection
            Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD)) {
            String query = "INSERT INTO student(full_name, age, college, phone, continent, experience) VALUES (?, ?, ?, ?, ?, ?) ";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, user.getName());
            stmt.setInt(2, user.getAge());
            stmt.setString(3, user.getCollege());
             stmt.setString(4, user.getPhone());
            stmt.setString(5, user.getContinent());
            stmt.setString(6, user.getExperience());
            // After this query will look like:
            // "INSERT INTO patient(name, age, college, phone, continent, experience) VALUES ('Nana', 27, 'College of Engineering (COE)', '437-345-3434', 'Africa', 'Football, Dancing') "
            int rows = stmt.executeUpdate();
            System.out.println("Rows inserted: " + rows);
            // Close the connection
        }
    }

    // R - Read: Getting all the values from the database
    public static ArrayList<Student> getUsers() throws SQLException {
    ArrayList<Student> users = new ArrayList<>();

    String query = "SELECT * FROM student";

    try (Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(query)) {
        
        System.out.println("Result:" + rs);
        
        while (rs.next()) {
            Student user = new Student();
            // Get each field from the result set
            user.setId(rs.getInt("student_id"));
            user.setName(rs.getString("full_name"));
            user.setAge(rs.getInt("age"));
            user.setCollege(rs.getString("college"));
            user.setPhone(rs.getString("phone"));
            user.setContinent(rs.getString("continent"));
            user.setExperience(rs.getString("experience"));
            users.add(user);
        }rs.close();
    }
    return users;
    }
            // Create Student object (assuming your Student class supports this)
           


    // U - Update: Changing a value in the database
    public static void updateUser(Student oldUser, Student updatedUser) throws SQLException {
        String query = "UPDATE student SET full_name = ?,  age = ?, college = ?, phone = ?, continent = ?, experience = ? WHERE student_id = ? ";

        // Update the query
        Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        PreparedStatement stmt = conn.prepareStatement(query);

        stmt.setString(1, updatedUser.getName());
        stmt.setInt(2, updatedUser.getAge());
        stmt.setString(3, updatedUser.getCollege());
        stmt.setString(5, updatedUser.getContinent());
        stmt.setString(6, updatedUser.getExperience());
        stmt.setInt(7, (int) oldUser.getId());

        int rows = stmt.executeUpdate();

        System.out.println("Rows updated: " + rows);
        conn.close();

    }

    // D - Delete 
    public static void deleteUser(Student user) throws SQLException {
        String query = "DELETE FROM student WHERE student_id = ?";

        Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        PreparedStatement stmt = conn.prepareStatement(query);

        stmt.setInt(1, (int) user.getId());

        int rows = stmt.executeUpdate();

        System.out.println("Rows deleted: " + rows);
        conn.close();

    }
}
