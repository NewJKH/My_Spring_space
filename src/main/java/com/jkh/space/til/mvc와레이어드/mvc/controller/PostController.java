package com.jkh.space.til.mvc와레이어드.mvc.controller;

import com.jkh.space.til.mvc와레이어드.layer.domain.Post;
import com.jkh.space.til.mvc와레이어드.layer.repository.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PostController {
    private final PostRepository repository = new PostRepository();

    @GetMapping("/posts/{id}")
    public String getPost(@PathVariable Long id, Model model) {
        Post post = repository.findById(id);
        model.addAttribute("post", post);
        return "postView";
    }
}