package com.example.spartahomework.service;

import com.example.spartahomework.domain.PostReq;
import com.example.spartahomework.domain.PostRes;
import com.example.spartahomework.entity.Post;
import com.example.spartahomework.repository.Repository;



public class PostService {
    private Repository repository;
    public boolean pwCheck(String inputPw, String postPw){
        return inputPw.equals(postPw);
    }
    public PostRes createPost(PostReq postReq){
        Post post = new Post(postReq);


    }
}
