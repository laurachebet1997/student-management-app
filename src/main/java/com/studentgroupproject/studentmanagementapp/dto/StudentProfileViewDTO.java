package com.studentgroupproject.studentmanagementapp.dto;

public class StudentProfileViewDTO {

    private StudentDTO student;
    private EnrollmentSummaryDTO enrollment;

    // Standard constructor for data only
    public StudentProfileViewDTO(StudentDTO student, EnrollmentSummaryDTO enrollment) {
        this.student = student;
        this.enrollment = enrollment;
    }

    // Getters and Setters
    public StudentDTO getStudent() { return student; }
    public void setStudent(StudentDTO student) { this.student = student; }
    public EnrollmentSummaryDTO getEnrollment() { return enrollment; }
    public void setEnrollment(EnrollmentSummaryDTO enrollment) { this.enrollment = enrollment; }
}