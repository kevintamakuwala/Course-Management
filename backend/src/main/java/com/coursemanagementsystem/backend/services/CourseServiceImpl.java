package com.coursemanagementsystem.backend.services;

import com.coursemanagementsystem.backend.entities.Course;
import com.coursemanagementsystem.backend.dao.CourseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    List<Course> courses;
    @Autowired
    CourseDao courseDao;

    public CourseServiceImpl() {
        courses = new ArrayList<>();
    }

    @Override
    public List<Course> getCourses() {
//        return courses;
        return courseDao.findAll();
    }

    @Override
    public Course getCourseById(String courseId) {
//        for (Course c : courses) {
//            if (c.getId() == Long.parseLong(courseId)) {
//                return c;
//            }
//        }
//        return null;
        return courseDao.getOne(Long.parseLong(courseId));
    }

    @Override
    public Course addCourse(Course course) {
//      courses.add(course);
//      return course;
        courseDao.save(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {
//        for (Course c : courses) {
//            if (course.getId() == c.getId()) {
//                c.setTitle(course.getTitle());
//                c.setDescription(course.getDescription());
//                return c;
//            }
//        }
//        return null;
        courseDao.save(course);
        return course;
    }

    @Override
    public boolean deleteCourse(Long courseId) {
//        int size = courses.size();
//        courses = courses.stream().filter(e -> e.getId() != courseId).collect(Collectors.toList());
//        return size == courses.size() + 1;
        courseDao.deleteById(courseId);
        return true;
    }
}
