package com.website.app.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfileController {
    //Controllers need to have certain repositories, and also need to be called in a constructor.
    public ProfileController() {

    }




    @GetMapping("/profile")
    public String showProfile() {
        return "profile";
    }
}
