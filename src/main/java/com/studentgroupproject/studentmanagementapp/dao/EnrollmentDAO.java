package com.studentgroupproject.studentmanagementapp.dao;

import com.studentgroupproject.studentmanagementapp.model.Enrollment;

import java.util.List;
import java.util.Optional;

public interface EnrollmentDAO {

    Enrollment save(Enrollment enrollment);

    Optional<Enrollment> findById(Long id);

    void deleteById(Long id);

    List<Enrollment> findAll();


    List<Enrollment> findByStudentId(Long studentId);

    Optional<Enrollment> findByStudentIdAndCourseId(Long studentId, Long courseId);
}
