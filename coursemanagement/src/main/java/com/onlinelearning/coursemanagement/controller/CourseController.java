package com.onlinelearning.coursemanagement.controller;

import com.onlinelearning.coursemanagement.model.Course;
import com.onlinelearning.coursemanagement.repository.CourseRepository;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    private final CourseRepository repository;

    public CourseController(CourseRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Course createCourse(@Valid @RequestBody Course course) {
        return repository.save(course);
    }

    @GetMapping
    public List<Course> getAllCourses(
            @RequestParam(required = false) String sortBy) {

        if ("title".equalsIgnoreCase(sortBy)) {
            return repository.findAll(
                    org.springframework.data.domain.Sort.by("title"));
        }

        if ("description".equalsIgnoreCase(sortBy)) {
            return repository.findAll(
                    org.springframework.data.domain.Sort.by("description"));
        }

        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Course getCourseById(@PathVariable Long id) {
        return repository.findById(id).orElseThrow();
    }

    @GetMapping("/category/{category}")
    public List<Course> getCoursesByCategory(@PathVariable String category) {
        return repository.findByCategory(category);
    }

    @PutMapping("/{id}")
    public Course updateCourse(@PathVariable Long id,
                               @RequestBody Course updatedCourse) {

        Course course = repository.findById(id).orElseThrow();

        course.setTitle(updatedCourse.getTitle());
        course.setDescription(updatedCourse.getDescription());
        course.setInstructorName(updatedCourse.getInstructorName());
        course.setDifficultyLevel(updatedCourse.getDifficultyLevel());
        course.setCategory(updatedCourse.getCategory());

        return repository.save(course);
    }

    @DeleteMapping("/{id}")
    public void deleteCourse(@PathVariable Long id) {
        repository.deleteById(id);
    }
}