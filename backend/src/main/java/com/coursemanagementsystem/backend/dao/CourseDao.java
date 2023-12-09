package com.coursemanagementsystem.backend.dao;

import com.coursemanagementsystem.backend.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Course, Long> {

}
