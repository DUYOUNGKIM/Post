package com.example.spartahomework.entity;

import com.example.spartahomework.domain.PostReq;
import com.example.spartahomework.domain.PostRes;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
public class Post  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String contents;
    public Post(PostReq postReq){
        this.title = postReq.getTitle();
        this.username = postReq.getUsername();
        this.password = postReq.getPassword();
        this.contents = postReq.getContents();
    }
    public void updatePost(PostReq postReq) {
        this.title = postReq.getTitle();
        this.username = postReq.getUsername();
        this.contents = postReq.getContents();
    }
    private PostRes transPostRes(Post post){
        return new PostRes(post);
    }
    public void checkPassword(String password){
        if(!password.equals(this.getPassword()))throw new IllegalStateException("wrong password!");
    }







}
