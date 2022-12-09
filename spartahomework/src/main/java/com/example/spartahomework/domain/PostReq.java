package com.example.spartahomework.domain;

import com.example.spartahomework.entity.Post;
import lombok.Getter;

@Getter
public class PostReq {
    private String title;
    private String username;
    private String password;
    private String contents;

}
