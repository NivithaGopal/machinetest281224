package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import dbconnection.dbconnection;
import bean.*;

public class AddDAO {
    
    public boolean addStudent(StudentBean student) {
        String query = "INSERT INTO students (name, age, major, year) VALUES (?, ?, ?, ?);";
        boolean result = false;

        try (Connection connection = dbconnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
        	
            statement.setString(1, student.getName());
            statement.setInt(2, student.getAge());
            statement.setString(3, student.getMajor());
            statement.setString(4, student.getYear());

            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                result = true; 
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return result;  
    }
}
