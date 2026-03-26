package com.studentgroupproject.studentmanagementapp.Controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
//import org.springframework.security.core.userdetails.User;
import com.studentgroupproject.studentmanagementapp.model.Users;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.studentgroupproject.studentmanagementapp.repository.UsersRepository;

@Controller
public class ProfileController {

    @GetMapping("/profile")
    public String profile(@AuthenticationPrincipal UserDetails userDetails,
                          Model model) {

        // username is usually the email in Spring Security
        String username = userDetails.getUsername();

        // If your UserDetails stores a display name, use that,Otherwise fall back to the username
        model.addAttribute("profileEmail", username);
        model.addAttribute("profileName",  username); // replace with real name if stored

        return "profile"; // → templates/profile.html
    }
}
//    public String profile(@AuthenticationPrincipal UserDetails userDetails,
//                          Model model) {
//
//        // username is usually the email in Spring Security
//        String username = userDetails.getUsername();
//
//        // If your UserDetails stores a display name, use that
//        // Otherwise fall back to the username
//        model.addAttribute("profileEmail", username);
//        model.addAttribute("profileName",  username); // replace with real name if stored
//
//        return "profile"; // → templates/profile.html
//    }

