package com.jkh.space.memo.entity.memo;

import com.jkh.space.memo.entity.dto.MemoRequestDto;
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

    public Memo update(MemoRequestDto dto){
        this.title = dto.getTitle();
        this.content = dto.getContent();
        return this;
    }
}
