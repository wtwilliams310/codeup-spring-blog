package com.codeup.codeupspringblog.controllers;

import com.codeup.codeupspringblog.models.Post;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SinglePostController {

    @GetMapping("/posts/single-post")
    public String returnSinglePost() {
        Post post = new Post();
        return "posts/show";
    }
}
