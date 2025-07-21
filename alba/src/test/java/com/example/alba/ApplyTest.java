package com.example.alba;

import com.example.alba.domain.AlbaUser;
import com.example.alba.domain.Apply;
import com.example.alba.mapper.AlbaUserMapper;
import com.example.alba.mapper.ApplyMapper;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@MapperScan("com.example.alba.mapper")
public class ApplyTest {

    @Autowired
    ApplyMapper mapper;
    @Test
    public void testExist() {
        System.out.println(mapper);
    }

    @Test
    public void testList() {
        List<Apply> apply = mapper.applyList();
        System.out.println(apply);
    }
}
