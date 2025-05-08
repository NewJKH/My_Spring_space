package com.jkh.space.til.mvc와레이어드.layer.service;

import com.jkh.space.til.mvc와레이어드.layer.domain.Post;
import com.jkh.space.til.mvc와레이어드.layer.repository.PostRepository;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    private final PostRepository repository;

    public PostService(PostRepository repository) {
        this.repository = repository;
    }

    public Post getPost(Long id) {
        return repository.findById(id);
    }
}