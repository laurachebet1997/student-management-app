package com.studentgroupproject.studentmanagementapp.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.studentgroupproject.studentmanagementapp.dto.CourseDTO;



public interface CourseService {

    CourseDTO createCourse(CourseDTO courseDTO);

    boolean existsByCourseCode(String code);

    boolean existsByCourseCodeAndIdNot(String code, Long id);

    Page<CourseDTO> getCourses(int page, int size);

    CourseDTO getCourseById(Long id);

    CourseDTO updateCourse(Long id, CourseDTO courseDTO);

    List<CourseDTO> getAllCourses();

    void deleteCourse(Long id);
}
