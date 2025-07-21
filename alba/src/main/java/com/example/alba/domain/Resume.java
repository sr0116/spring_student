package com.example.alba.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Alias("resume")
public class Resume {
    private int resumeNo;
    private int userNo;
    private String title;
//    private String name;
//    private String tel;
//    private String area;
    private String introduce;
}