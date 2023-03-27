//package com.codeup.codeupspringblog.controllers;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//@Controller
//public class PostController {
//
//
//    @GetMapping("/posts")
//    @ResponseBody
//    public String posts(){
//        return "Here are the blog posts";
//    }
//
//    @GetMapping("/posts/{id}")
//    @ResponseBody
//    public String postsID(@RequestParam long id){
//        return "Individual blog post" + id;
//    }
//
//    @GetMapping("/posts/create")
//    @ResponseBody
//    public String createPost(){
//        return "Form to create post";
//    }
//
////    @PostMapping("/posts/create")
////    @ResponseBody
////    public String posts(@RequestBody String postBody){
////        return postBody;
////    }
//
//    @PostMapping("/posts/create")
//    public String createPosts(){
//        return "Creating post...";
//    }
//}
