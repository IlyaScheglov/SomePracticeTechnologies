package com.example.SomePracticeTechnologies.dto;

import com.example.SomePracticeTechnologies.entity.Users;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PostsDTO {

    @JsonProperty("id")
    private long id;

    @JsonProperty("postText")
    private String postText;

}
