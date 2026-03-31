package com.studentgroupproject.studentmanagementapp.config;


import com.studentgroupproject.studentmanagementapp.model.Courses;
import com.studentgroupproject.studentmanagementapp.model.Enrollment;
import com.studentgroupproject.studentmanagementapp.model.Students;
import com.studentgroupproject.studentmanagementapp.model.Users;
import com.studentgroupproject.studentmanagementapp.repository.CourseRepository;
import com.studentgroupproject.studentmanagementapp.repository.EnrollmentRepository;
import com.studentgroupproject.studentmanagementapp.repository.StudentRepository;
import com.studentgroupproject.studentmanagementapp.repository.UsersRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.math.BigDecimal;
import java.util.Arrays;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner loadSampleData(
            UsersRepository usersRepository,
            StudentRepository studentRepository,
            CourseRepository courseRepository,
            PasswordEncoder passwordEncoder,
            EnrollmentRepository enrollmentRepository) {
        return args -> {

            // 1. Initialize Users (Your existing logic)
            String[] userNames = {"Admin", "Laura", "Rebecca", "Peter"};
            for (String name : userNames) {
                if (!usersRepository.existsByUsername(name)) {
                    Users user = new Users();
                    user.setUsername(name);
                    user.setPassword(passwordEncoder.encode(name.toLowerCase()));
                    user.setActive(true);
                    usersRepository.save(user);
                }
            }

            // 2. Initialize Courses existsByCourseCodeIgnoreCase
            if (!courseRepository.existsByCourseCodeIgnoreCase("CS")) {
                Courses  course = new Courses();
                course.setCourseName("Computer Science");
                course.setCourseCode("CS");
                course.setDuration("3 years");
                course.setActive(true);
                course.setCourseCF(4) ;
                course.setFee(new BigDecimal("100000"));
                course.setDescription("Mathematics and Computer") ;
                courseRepository.save(course);
            }
            if (!courseRepository.existsByCourseCodeIgnoreCase("bS")) {
                Courses  course = new Courses();
                course.setCourseName("Business Studies");
                course.setCourseCode("BS");
                course.setDuration("2 years");
                course.setActive(true);
                course.setCourseCF(3) ;
                course.setFee(new BigDecimal("30000"));
                course.setDescription("Business and Finance") ;
                courseRepository.save(course);
            }
            if (!courseRepository.existsByCourseCodeIgnoreCase("NS")) {
                Courses  course = new Courses();
                course.setCourseName("Nursing");
                course.setCourseCode("NS");
                course.setDuration("4 years");
                course.setActive(true);
                course.setCourseCF(4) ;
                course.setFee(new BigDecimal("60000"));
                course.setDescription("Health and Hospitality") ;
                courseRepository.save(course);
            }
            if (!courseRepository.existsByCourseCodeIgnoreCase("LW")) {
                Courses  course = new Courses();
                course.setCourseName("Law");
                course.setCourseCode("LW");
                course.setDuration("5 years");
                course.setActive(true);
                course.setCourseCF(3) ;
                course.setFee(new BigDecimal("80000"));
                course.setDescription("Legal education on practice of law") ;
                courseRepository.save(course);
            }
            if (!courseRepository.existsByCourseCodeIgnoreCase("EN")) {
                Courses  course = new Courses();
                course.setCourseName("Engineering");
                course.setCourseCode("EN");
                course.setDuration("6 years");
                course.setActive(true);
                course.setCourseCF(4) ;
                course.setFee(new BigDecimal("70000"));
                course.setDescription("Engineering Science") ;
                courseRepository.save(course);
            }

            // 3. Initialize Students
            if (!studentRepository.existsByEmailIgnoreCase("peter@gmail.com")) {
                Students  student = new Students();
                student.setFirstName("Peter");
                student.setLastName("Gituya");
                student.setEmail("peter@gmail.com");
                student.setPhoneNumber("+254745841707") ;
                student.setEnrollmentYear(1);
                student.setAddress("Kabarak") ;
                student.setActive(true);
                studentRepository.save(student);
            }
            if (!studentRepository.existsByEmailIgnoreCase("becky@gmail.com")) {
                Students  student = new Students();
                student.setFirstName("Becky");
                student.setLastName("Omoro");
                student.setEmail("becky@gmail.com");
                student.setPhoneNumber("+254708737725") ;
                student.setEnrollmentYear(2);
                student.setAddress("Kabarak") ;
                student.setActive(true);
                studentRepository.save(student);
            }
            if (!studentRepository.existsByEmailIgnoreCase("laura@gmail.com")) {
                Students  student = new Students();
                student.setFirstName("Laura");
                student.setLastName("Chebet");
                student.setEmail("laura@gmail.com");
                student.setPhoneNumber("+254740953906") ;
                student.setEnrollmentYear(4);
                student.setAddress("Kabarak") ;
                student.setActive(true);
                studentRepository.save(student);
            }
            if (!studentRepository.existsByEmailIgnoreCase("inactive@gmail.com")) {
                Students  student = new Students();
                student.setFirstName("Inactive");
                student.setLastName("Student");
                student.setEmail("inactive@gmail.com");
                student.setPhoneNumber("+254712345678") ;
                student.setEnrollmentYear(3);
                student.setAddress("Kabarak") ;
                student.setActive(false);
                studentRepository.save(student);
            }
            if (!studentRepository.existsByEmailIgnoreCase("deleteMe@gmail.com")) {
                Students  student = new Students();
                student.setFirstName("Delete");
                student.setLastName("Me");
                student.setEmail("deleteMe@gmail.com");
                student.setPhoneNumber("+254712345678") ;
                student.setEnrollmentYear(1);
                student.setAddress("Kabarak") ;
                student.setActive(true);
                studentRepository.save(student);
            }
            if (!studentRepository.existsByEmailIgnoreCase("updateMe@gmail.com")) {
                Students  student = new Students();
                student.setFirstName("Update");
                student.setLastName("Me");
                student.setEmail("updateMe@gmail.com");
                student.setPhoneNumber("+254712345678") ;
                student.setEnrollmentYear(2);
                student.setAddress("Kabarak") ;
                student.setActive(true);
                studentRepository.save(student);
            }
            if (!studentRepository.existsByEmailIgnoreCase("enrollMe@gmail.com")) {
                Students  student = new Students();
                student.setFirstName("Enroll");
                student.setLastName("Me");
                student.setEmail("enrollMe@gmail.com");
                student.setPhoneNumber("+254712345678") ;
                student.setEnrollmentYear(1);
                student.setAddress("Kabarak") ;
                student.setActive(true);
                studentRepository.save(student);
            }

            if (!studentRepository.existsByEmailIgnoreCase("activateMe@gmail.com")) {
                Students  student = new Students();
                student.setFirstName("Activate");
                student.setLastName("Me");
                student.setEmail("activateMe@gmail.com");
                student.setPhoneNumber("+254712345678") ;
                student.setEnrollmentYear(1);
                student.setAddress("Kabarak") ;
                student.setActive(false);
                studentRepository.save(student);
            }


            //save default enrollment.

            Students student1 = studentRepository.findByEmailIgnoreCase("enrollMe@gmail.com");
            Courses cs = courseRepository.findByCourseCodeIgnoreCase("CS");

            if (student1 != null && cs != null &&
                    !enrollmentRepository.existsByStudentAndCourse(student1, cs)) {

                Enrollment enrollment = new Enrollment();
                enrollment.setStudent(student1);
                enrollment.setCourse(cs);
                enrollmentRepository.save(enrollment);
            }

        };
    }
}