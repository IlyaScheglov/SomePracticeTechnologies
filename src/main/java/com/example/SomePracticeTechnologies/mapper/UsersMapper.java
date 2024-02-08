package com.example.SomePracticeTechnologies.mapper;

import com.example.SomePracticeTechnologies.dto.PostsDTO;
import com.example.SomePracticeTechnologies.dto.UsersDTO;
import com.example.SomePracticeTechnologies.entity.Posts;
import com.example.SomePracticeTechnologies.entity.Users;
import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.factory.Mappers;

import java.util.ArrayList;
import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UsersMapper {

    PostsMapper postsMapper = Mappers.getMapper(PostsMapper.class);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "username", source = "username")
    @Mapping(target = "posts", ignore = true)
    UsersDTO mapToUsersDTO(Users user);

    List<UsersDTO> mapToUsersDTOs(List<Users> users);

    default List<UsersDTO> mapToUsersDTOsWithPosts(List<Users> users){
        List<UsersDTO> usersDTOs = new ArrayList<>();
        users.forEach(u -> {
            UsersDTO usDTO = mapToUsersDTO(u);
            List<PostsDTO> postsDTOs = postsMapper.mapToPostDTOs(u.getPostsList());
            usDTO.setPosts(postsDTOs);
            usersDTOs.add(usDTO);
        });
        return usersDTOs;
    }

}
