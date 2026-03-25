package com.studentgroupproject.studentmanagementapp.Controller;

import com.studentgroupproject.studentmanagementapp.dto.EnrollmentSummaryDTO;
import com.studentgroupproject.studentmanagementapp.dto.StudentProfileViewDTO;
import com.studentgroupproject.studentmanagementapp.service.EnrollmentService;
import com.studentgroupproject.studentmanagementapp.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.data.domain.Page;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.studentgroupproject.studentmanagementapp.dto.StudentDTO;


@Controller
@RequestMapping("/studentsViews")
public class StudentProfileViewController {

    private static final Logger log = LoggerFactory.getLogger(StudentProfileViewController.class);

    private final EnrollmentService enrollmentService;
    private final StudentService studentService;

    // Only inject the services you need to fetch data
    public StudentProfileViewController(EnrollmentService enrollmentService, StudentService studentService) {
        this.enrollmentService = enrollmentService;
        this.studentService = studentService;
    }


    @GetMapping("/list")
    public String listStudent(@RequestParam(defaultValue = "0") int page,
                              @RequestParam(defaultValue = "3") int size,
                              Model model,
                              @RequestParam(value="message", required = false) String message) {

        Page<StudentDTO> studentPage = studentService.getStudents(page, size);

        Page<StudentProfileViewDTO> displayPage = studentPage.map(student -> {
            // Fetch the summary using the service injected in the CONTROLLER
            EnrollmentSummaryDTO summary = enrollmentService.findEnrolledStudentCourseDetails(student.getId());

            // Return a new DTO instance with just the data
            return new StudentProfileViewDTO(student, summary);
        });

        model.addAttribute("students", displayPage);
        model.addAttribute("message", message);

        return "students";
    }
}
