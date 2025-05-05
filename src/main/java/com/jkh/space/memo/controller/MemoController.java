package com.jkh.space.memo.controller;

import com.jkh.space.memo.entity.dto.MemoRequestDto;
import com.jkh.space.memo.entity.dto.MemoResponseDto;
import com.jkh.space.memo.entity.memo.Memo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/memos")
public class MemoController {
    private final Map<Long, Memo> memoList = new HashMap<>();

    @PostMapping
    public ResponseEntity<MemoResponseDto> createMemo(@RequestBody MemoRequestDto dto){
        Long id = memoList.isEmpty() ? 1 : Collections.max(memoList.keySet())+1;

        Memo memo = new Memo(id,dto.getTitle(),dto.getContent());
        memoList.put(id,memo);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new MemoResponseDto(memo));
    }

}
