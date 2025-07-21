package com.example.alba;

import com.example.alba.domain.AlbaUser;
import com.example.alba.domain.Gonggo;
import com.example.alba.domain.Resume;
import com.example.alba.mapper.AlbaUserMapper;
import com.example.alba.mapper.GonggoMapper;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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

    @Test
    public void testSelectOne() {
        int gonggoNo = 8;
        Gonggo gonggo = mapper.selectOneGonggo(gonggoNo);
        System.out.println(gonggo);
    }


    @Test
    public void testInsert(){
        int userNo = 1;

        Gonggo gonggo = Gonggo.builder()
                .userNo(userNo)
                .title("인서트 테스트")
                .role("스탭")
                .workHours(5)
                .wage(12000)
                .workingStartDate(LocalDate.of(2025, 7, 1))
                .workingEndDate(LocalDate.of(2025, 8, 1))
                .state(false)
                .comArea("서울")
                .tel("010-2222-8888")
                .build();
        mapper.insertGonggo(gonggo);
    }

    @Test
    public void testUpdate(){
        int gonggoNo = 8;
        Gonggo gonggo = Gonggo.builder()
                .gonggoNo(gonggoNo)
                .title("수정 테스트")
                .role("홀서빙")
                .workHours(5)
                .wage(12000)
                .workingStartDate(LocalDate.of(2025, 7, 1))
                .workingEndDate(LocalDate.of(2025, 8, 1))
                .state(false)
                .comArea("서울")
                .tel("010-2222-8888")
                .build();
            mapper.updateGonggo(gonggo);
    }
    @Test
    public void remove(){
        int gonggoNo = 2;
        mapper.deleteGonggo(gonggoNo);
    }


}
