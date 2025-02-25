package business;

import model.Course;

public class CourseValidator {
    public static boolean isValidCourse(Course course) {
        return course.getCredits() > 0 && !course.getCourseName().isEmpty();
    }
}
