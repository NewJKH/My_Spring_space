package com.jkh.space.memo.entity.memo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Memo {
    private Long id;
    private String title;
    private String content;

    public Memo update(Memo memo){
        this.title = memo.getTitle();
        this.content = memo.getContent();
        return this;
    }
}
