package com.studentgroupproject.studentmanagementapp.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StaticPageController {

    // Announcements
    @GetMapping("/announcements")
    public String announcements() {
        return "announcements";
    }

    // Reports
    @GetMapping("/report")
    public String reports() {
        return "report";
    }

    // Help
    @GetMapping("/help")
    public String help() {
        return "help";
    }

    // Settings
    @GetMapping("/settings")
    public String settings() {
        return "settings";
    }
}
