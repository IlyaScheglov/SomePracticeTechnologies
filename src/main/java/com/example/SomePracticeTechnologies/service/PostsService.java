package com.example.SomePracticeTechnologies.service;

import com.example.SomePracticeTechnologies.repository.PostsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@RequiredArgsConstructor
public class PostsService {

    private final PostsRepository postsRepository;
}
