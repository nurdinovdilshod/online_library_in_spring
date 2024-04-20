package uz.pdp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("username", "Dilshod");
        return "auth/signup";
    }


}
