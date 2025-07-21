package com.example.alba;

import com.example.alba.domain.AlbaUser;
import com.example.alba.domain.Gonggo;
import com.example.alba.mapper.AlbaUserMapper;
import com.example.alba.mapper.GonggoMapper;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@MapperScan("com.example.alba.mapper")
public class GonggoTest {

    @Autowired
    GonggoMapper mapper;

    @Test
    public void testExist() {
        System.out.println(mapper);
    }

    @Test
    public void testList() {
        List<Gonggo> gonggoList = mapper.gonggoList();
        System.out.println(gonggoList);
    }
}
