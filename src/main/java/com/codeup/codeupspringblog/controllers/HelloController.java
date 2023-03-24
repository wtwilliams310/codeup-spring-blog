package com.codeup.codeupspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/howdy")
    public String returnHowdyPage(Model model) {
        model.addAttribute("name", "Titus");
        model.addAttribute("favNum", "21");
//        the return is the file path to the html file Hello.html
        return "hello";
    }
}
