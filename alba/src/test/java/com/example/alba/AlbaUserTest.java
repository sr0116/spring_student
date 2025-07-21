package com.example.alba;

import com.example.alba.domain.AlbaUser;
import com.example.alba.mapper.AlbaUserMapper;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
@SpringBootTest
@MapperScan("com.example.alba.mapper")
public class AlbaUserTest {

    @Autowired
    AlbaUserMapper mapper;

    @Test
    public void testExist() {
        System.out.println(mapper);
    }

    @Test
    public void testList() {
        List<AlbaUser> albaUsers = mapper.albaUserList();
        System.out.println(albaUsers);
    }

    @Test
    public void testInsetAlba(){
        AlbaUser albaUser = new AlbaUser().builder()
                .name("테스트")
                .tel("010-2222-1234")
                .id("test")
                .pw("test123")
                .area("서울")
                .build();

        mapper.insertAlba(albaUser);
    }

    @Test
    public void testRemoveAlba(){
        int userNo = 3;
        mapper.deleteAlba(userNo);

    }

    @Test
    public  void TestModifyAlba(){
        int userNo = 2;
        AlbaUser albaUser = AlbaUser.builder()
                .userNo(userNo)
                .name("테스트")
                .tel("010-2222-1234")
                .id("test")
                .pw("test123")
                .area("서울")
                .build();

        mapper.updateAlba(albaUser);
    }

    @Test
    public  void TestSelectOne(){
        int userNo = 1;

        AlbaUser albaUser = mapper.selectOneAlba(userNo);

        System.out.println(albaUser);


    }
}
