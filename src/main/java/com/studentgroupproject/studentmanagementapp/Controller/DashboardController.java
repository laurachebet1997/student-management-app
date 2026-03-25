package com.studentgroupproject.studentmanagementapp.Controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.studentgroupproject.studentmanagementapp.service.DashboardService;
import com.studentgroupproject.studentmanagementapp.service.EnrollmentService;

import java.security.Principal;

@Controller
public class DashboardController {

    private static final Logger log = LoggerFactory.getLogger(EnrollmentController.class);

    private final EnrollmentService enrollmentService;
    private final DashboardService dashboardService;

    public DashboardController(EnrollmentService enrollmentService,
                               DashboardService dashboardService) {
        this.enrollmentService = enrollmentService;
        this.dashboardService = dashboardService;
    }


    @GetMapping("/dashboard")
    public String dashboard(Model model, Principal principal) {
        String username = principal.getName(); // logged-in user
        model.addAttribute("adminName", username);
        model.addAttribute("dashboardStats", dashboardService.getDashboardStats());
        model.addAttribute("students", enrollmentService.getRecentlyEnrolledStudents());
        return "dashboard";
    }

}
