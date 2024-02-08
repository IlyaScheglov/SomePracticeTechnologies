package com.example.SomePracticeTechnologies.controller;

import com.example.SomePracticeTechnologies.dto.PostsDTO;
import com.example.SomePracticeTechnologies.dto.UsersDTO;
import com.example.SomePracticeTechnologies.entity.Users;
import com.example.SomePracticeTechnologies.mapper.PostsMapper;
import com.example.SomePracticeTechnologies.mapper.UsersMapper;
import com.example.SomePracticeTechnologies.service.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class MainController {

    private final UsersMapper usersMapper;
    private final PostsMapper postsMapper;
    private final UsersService usersService;

    @GetMapping("/get-all-users")
    public ResponseEntity<List<UsersDTO>> getAllUsers(){
        List<UsersDTO> usersDTOs = usersMapper.mapToUsersDTOsWithPosts(usersService.getAllUsers());
        return new ResponseEntity<>(usersDTOs, HttpStatus.OK);
    }
}
