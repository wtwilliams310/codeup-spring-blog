package com.codeup.codeupspringblog.controllers;

import com.codeup.codeupspringblog.models.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class AllPostsController {

    @GetMapping("/posts")
    public String returnAllPosts(Model model) {
//        Post post1 = new Post("Post1", "Body1");
//        Post post2 = new Post("Post2", "Body2");

        List<Post> posts = new ArrayList<>(Arrays.asList(
                new Post("Post1", "Body1"),
                new Post("Post2", "Body2")
        ));

        model.addAttribute("posts", posts);

        return "posts/index";
    }

}
