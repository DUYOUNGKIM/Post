package com.example.spartahomework.repository;

import com.example.spartahomework.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;

public interface Repository extends JpaRepository<Post ,Long> {

}
