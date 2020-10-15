package com.mandatory.mandatory.controller;

import com.mandatory.mandatory.model.Comment;
import com.mandatory.mandatory.model.Post;
import com.mandatory.mandatory.repository.CategoryRepository;
import com.mandatory.mandatory.repository.CommentRepository;
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

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    CommentRepository commentRepository;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("post_", postRepository.findAll());
        return "index";
    }

    @GetMapping("/view-post/{id}")
    public String viewGET(@PathVariable("id") Long id, Model model) {
        Post post = postRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid post Id:" + id));
        model.addAttribute("post_", post);
        return "/view-post";
    }

    @PostMapping("/view-post")
    public String viewPOST(@ModelAttribute Comment comment) {
        try {
            commentRepository.save(comment);
            return "redirect:/";
        } catch (Exception ex) {
            System.out.println("Not created!");
            return "redirect:/";
        }
    }

    @GetMapping("/add-post")
    public String addGET(Model model) {
        model.addAttribute("cat_", categoryRepository.findAll());
        return "add-post";
    }

    @PostMapping("/add-post")
    public String addPOST(@ModelAttribute Post post) {
        try {
            postRepository.save(post);
            return "redirect:/";
        } catch (Exception ex) {
            System.out.println("Not created!");
            return "redirect:/";
        }
    }

    @GetMapping("/edit-post/{id}")
    public String editGET(@PathVariable("id") Long id, Model model) {
        Post post = postRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid post Id:" + id));
        model.addAttribute("post_", post);

        model.addAttribute("cat_", categoryRepository.findById(id));
        return "edit-post";
    }

    @PostMapping("/edit-post")
    public String editPOST(@ModelAttribute Post post) {
        try {
            postRepository.save(post);
            return "redirect:/";
        } catch (Exception ex) {
            System.out.println("Not created!");
            return "redirect:/";
        }
    }

    @GetMapping("/delete-post/{id}")
    public String deletePost(@PathVariable("id") Long id, Model model) {
        try {
            postRepository.deleteById(id);
            return "redirect:/";
        } catch (Exception ex) {
            System.out.println("Blog post was not deleted!");
            return "redirect:/";
        }
    }
}