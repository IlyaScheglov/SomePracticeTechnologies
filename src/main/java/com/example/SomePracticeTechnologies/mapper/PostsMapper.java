package com.example.SomePracticeTechnologies.mapper;

import com.example.SomePracticeTechnologies.dto.PostsDTO;
import com.example.SomePracticeTechnologies.entity.Posts;
import org.mapstruct.Mapper;
import org.mapstruct.MapperConfig;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PostsMapper {

    @Mapping(target = "id", source = "id")
    @Mapping(target = "postText", source = "postText")
    PostsDTO mapToPostsDTO(Posts post);

    List<PostsDTO> mapToPostDTOs(List<Posts> posts);
}
