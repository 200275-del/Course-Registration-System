package persistence;

import model.Student;
import database.DBConnection;
import java.sql.*;

public class StudentDAO {

    public void addStudent(Student student) throws SQLException {
        String query = "INSERT INTO students (name, dob, program, year, contact) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, student.getName());
            stmt.setString(2, student.getDob());
            stmt.setString(3, student.getProgram());
            stmt.setInt(4, student.getYear());
            stmt.setString(5, student.getContact());
            stmt.executeUpdate();
        }
    }
}
