package com.studentgroupproject.studentmanagementapp.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.security.Principal;

@ControllerAdvice
public class GlobalControllerAdvice {

    @ModelAttribute("adminName")
    public String addAdminName(Principal principal) {
        return principal != null ? principal.getName() : "";
    }
}
