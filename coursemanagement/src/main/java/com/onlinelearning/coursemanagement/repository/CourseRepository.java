package com.onlinelearning.coursemanagement.repository;
import java.util.List;
import com.onlinelearning.coursemanagement.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {

    List<Course> findByCategory(String category);
}