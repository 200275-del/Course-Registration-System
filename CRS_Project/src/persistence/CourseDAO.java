package persistence;

import model.Course;
import java.sql.*;

public class CourseDAO {
    private Connection conn;

    public CourseDAO(Connection conn) {
        this.conn = conn;
    }

    public void addCourse(Course course) throws SQLException {
        String sql = "INSERT INTO courses (courseId, courseName, credits) VALUES (?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, course.getCourseId());
        stmt.setString(2, course.getCourseName());
        stmt.setInt(3, course.getCredits());
        stmt.executeUpdate();
    }
}
