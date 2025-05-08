package com.jkh.space.til.mvc와레이어드.mvc.repository;

import com.jkh.space.til.mvc와레이어드.mvc.model.Post;

public class PostRepository {
    public Post findById(Long id) {
        return new Post(id, "제목", "내용");
    }
}