package com.example.SomePracticeTechnologies.repository;

import com.example.SomePracticeTechnologies.entity.Posts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostsRepository extends JpaRepository<Posts, Long> {
}
