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
@Alias("user")
public class User {
//    일반 회원
    private int userNo;
    private String name;
    private String tel;
    private String id;
    private String pw;
    private String area;
    private int memberType;
    private String companyArea;
    private String companyName;
    private String companyNumber;

    public User(int memberType, String name, String tel, String id, String pw, String area,  String companyArea, String companyName, String companyNumber) {
        this.name = name;
        this.tel = tel;
        this.id = id;
        this.pw = pw;
        this.area = area;

        this.companyArea = companyArea;
        this.memberType = memberType;
        this.companyName = companyName;
        this.companyNumber = companyNumber;
    }

    public User(String name, String tel, String id, String pw, String area) {
        this.name = name;
        this.tel = tel;
        this.id = id;
        this.pw = pw;
        this.area = area;
    }
}

