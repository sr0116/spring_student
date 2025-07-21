package com.example.alba;

import com.example.alba.domain.AlbaUser;
import com.example.alba.domain.Resume;
import com.example.alba.mapper.AlbaUserMapper;
import com.example.alba.mapper.ResumeMapper;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@MapperScan("com.example.alba.mapper")
public class ResumeTest {

    @Autowired
    ResumeMapper mapper;
    @Test
    public void testExist() {
        System.out.println(mapper);
    }

    @Test
    public void testList() {
        List<Resume> resumes = mapper.resumeList();
        System.out.println(resumes);
    }

    @Test
    public void testselectOneResume() {

        int userNo = 1;
       Resume resumes = mapper.selectOneResume(userNo);
        System.out.println(resumes);
    }
}
