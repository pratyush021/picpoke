package com.pickpoke.api.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PostDetails {
    private String postId;
    private String picUrl;
    private String captions;
    private Metadata metadata;

}
