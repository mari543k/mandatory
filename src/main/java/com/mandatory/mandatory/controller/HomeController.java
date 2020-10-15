package com.mandatory.mandatory.controller;

import com.mandatory.mandatory.model.Post;
import com.mandatory.mandatory.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @Autowired
    PostRepository postRepository;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("post_", postRepository.findAll());
        return "index";
    }

    @GetMapping("/view-post/{id}")
    public String view(@PathVariable("id") Long id, Model model) {
        model.addAttribute("post_", postRepository.findById(id));
        return "view-post";
    }

    @GetMapping("/add-post")
    public String addGET() {
        return "add-post";
    }

    @PostMapping("/add-post")
    public String addPOST(@ModelAttribute Post post, Model model) {
        try {
            postRepository.save(post);
            return "index";
        } catch (Exception ex) {
            System.out.println("Not created!");
            return "index";
        }
    }
}
