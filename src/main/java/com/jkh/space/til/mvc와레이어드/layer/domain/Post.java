package com.jkh.space.til.mvc와레이어드.layer.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Post {
    private Long id;
    private String title;
    private String content;
}
