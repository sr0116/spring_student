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
@Alias("businessUser")
public class BusinessUser {
    private int userNo;
    private String name;
    private String tel;
    private String id;
    private String pw;
    private String area;
    private String companyName;
    private String companyNumber;
}