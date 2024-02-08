package com.example.SomePracticeTechnologies.service;

import com.example.SomePracticeTechnologies.entity.Users;
import com.example.SomePracticeTechnologies.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsersService {

    private final UsersRepository usersRepository;

    public List<Users> getAllUsers(){
        return usersRepository.findAllWithPosts();
    }
}
