package com.example.spartahomework.domain;

import com.example.spartahomework.entity.Post;
import lombok.Getter;

@Getter
public class PostRes {
    private Long id;
    private  String title;
    private  String username;
    private  String contents;

    public PostRes(Post post){
        this.id = post.getId();
        this.title = post.getTitle();
        this.username = post.getUsername();
        this.contents = post.getContents();


    }

}
