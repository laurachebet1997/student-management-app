package com.studentgroupproject.studentmanagementapp.dao;

import com.studentgroupproject.studentmanagementapp.model.Courses;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface CourseDAO {

    List<Courses> findAll();
    Page<Courses> findAll(Pageable pageable);
    Courses save(Courses course);
    Optional<Courses> findById(Long id);
    void deleteById(Long id);
    Page<Courses> findByActiveTrue(Pageable pageable);
}
