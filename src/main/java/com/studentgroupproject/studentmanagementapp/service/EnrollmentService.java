package com.studentgroupproject.studentmanagementapp.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.studentgroupproject.studentmanagementapp.dto.EnrollmentDTO;
import com.studentgroupproject.studentmanagementapp.dto.EnrollmentSummaryDTO;

public interface EnrollmentService {

    void enrollStudentToCourses(EnrollmentDTO enrollmentDTO);

    Page<EnrollmentSummaryDTO> getEnrolledStudents(int page, int size);

    EnrollmentSummaryDTO findEnrolledStudentCourseDetails(Long studentId);

    List<EnrollmentSummaryDTO> getRecentlyEnrolledStudents();
}
