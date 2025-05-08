package com.jkh.space.til.mvc와레이어드.layer.controller;

import com.jkh.space.til.mvc와레이어드.layer.domain.Post;
import com.jkh.space.til.mvc와레이어드.layer.service.PostService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
public class PostController {
    private final PostService service;

    public PostController(PostService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public Post getPost(@PathVariable Long id) {
        return service.getPost(id);
    }
}