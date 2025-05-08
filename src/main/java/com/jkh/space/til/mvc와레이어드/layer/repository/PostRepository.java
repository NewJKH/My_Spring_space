package com.jkh.space.til.mvc와레이어드.layer.repository;

import com.jkh.space.til.mvc와레이어드.layer.domain.Post;
import org.springframework.stereotype.Repository;

@Repository
public class PostRepository {
    public Post findById(Long id) {
        return new Post(id, "제목", "내용");
    }
}