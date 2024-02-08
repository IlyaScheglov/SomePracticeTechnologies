package com.example.SomePracticeTechnologies.repository;

import com.example.SomePracticeTechnologies.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {

    @Query("SELECT u FROM Users u LEFT JOIN FETCH u.postsList")
    List<Users> findAllWithPosts();
}
