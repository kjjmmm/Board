package com.study.domain.post;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostResponse {

    private Long id;
    private String title;
    private String content;
    private String writer;
    private int viewCnt;
    private Boolean noticeVn;
    private Boolean deleteVn;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;

}
