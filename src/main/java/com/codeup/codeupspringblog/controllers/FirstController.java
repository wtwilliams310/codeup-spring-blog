package com.codeup.codeupspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {

//    @GetMapping("/hello")
//    @ResponseBody
//    public String returnHelloWorld() {
//        return "Hello Zenith";
//    }

    @GetMapping("/hello")
    @ResponseBody
    public String returnHelloWorld(@RequestParam boolean uppercase) {

        if (uppercase) {
            return "HELLO ZENITH";

        } else {

            return "Hello Zenith";
        }
    }

    @GetMapping("/hello/{fname}/{lname}")
    @ResponseBody
    public String greetName (@PathVariable String fname, @PathVariable String lname) {
        return "Hello " + fname + " " + lname;
    }


    @GetMapping("/titus")
    @ResponseBody
    public String returnTitus() {
        return "<h1>I'm Titus</h1>";
    }
}
