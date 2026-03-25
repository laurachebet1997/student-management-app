package com.studentgroupproject.studentmanagementapp.config;


import com.studentgroupproject.studentmanagementapp.model.Courses;
import com.studentgroupproject.studentmanagementapp.model.Students;
import com.studentgroupproject.studentmanagementapp.model.Users;
import com.studentgroupproject.studentmanagementapp.repository.CourseRepository;
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
            PasswordEncoder passwordEncoder) {
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
                course.setDuration("2 years");
                course.setActive(true);
                course.setFee(new BigDecimal("40000"));
                course.setDescription("Mathematics and Computer") ;
                courseRepository.save(course);
            }
            if (!courseRepository.existsByCourseCodeIgnoreCase("bS")) {
                Courses  course = new Courses();
                course.setCourseName("Business Studies");
                course.setCourseCode("BS");
                course.setDuration("2 years");
                course.setActive(true);
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
                course.setFee(new BigDecimal("60000"));
                course.setDescription("Health and Hospitality") ;
                courseRepository.save(course);
            }

            // 3. Initialize Students
            if (!studentRepository.existsByEmailIgnoreCase("peter@gmail.com")) {
                Students  student = new Students();
                student.setFirstName("Peter");
                student.setLastName("Gituya");
                student.setEmail("peter@gmail.com");
                student.setPhoneNumber("+247458107") ;
                student.setAddress("Kabarak") ;
                student.setActive(true);
                studentRepository.save(student);
            }
            if (!studentRepository.existsByEmailIgnoreCase("becky@gmail.com")) {
                Students  student = new Students();
                student.setFirstName("Becky");
                student.setLastName("Omoro");
                student.setEmail("becky@gmail.com");
                student.setPhoneNumber("+24708737725") ;
                student.setAddress("Kabarak") ;
                student.setActive(true);
                studentRepository.save(student);
            }
            if (!studentRepository.existsByEmailIgnoreCase("laura@gmail.com")) {
                Students  student = new Students();
                student.setFirstName("Laura");
                student.setLastName("Chebet");
                student.setEmail("laura@gmail.com");
                student.setPhoneNumber("+24740953906") ;
                student.setAddress("Kabarak") ;
                student.setActive(true);
                studentRepository.save(student);
            }
        };
    }
}