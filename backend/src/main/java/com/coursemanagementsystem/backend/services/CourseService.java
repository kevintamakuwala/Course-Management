package com.coursemanagementsystem.backend.services;

import com.coursemanagementsystem.backend.entities.Course;

import java.util.List;

public interface CourseService {
    public List<Course> getCourses();

    public Course getCourseById(String courseId);

    public Course addCourse(Course course);

    public Course updateCourse(Course course);

    public boolean deleteCourse(Long courseId);
}
