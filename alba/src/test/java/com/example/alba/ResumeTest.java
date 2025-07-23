package com.example.alba;

import com.example.alba.domain.Resume;
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
// 유저가 쓴 모든 이력서
    @Test
    public void testselectOneResume() {

        int userNo = 1;
       Resume resumes = mapper.selectOneResume(userNo);
        System.out.println(resumes);
    }

    @Test
    public void testinsertResume() {

        int userNo = 1;
       Resume resume = Resume.builder()
               .userNo(userNo)
               .title("이력서 추가")
               .introduce("자기소개")
               .build();

         mapper.insertResume(resume);
    }

    @Test
    public void testUpdateResume(){
        int resumeNo = 1;
        Resume  resume = Resume.builder()
                .resumeNo(resumeNo)
                .title("이력서 재수정")
                .introduce("자기소개")
                .build();
        mapper.updateResume(resume);
    }

    @Test
    public void remove(){
        int resumeNo = 2;
        mapper.deleteResume(resumeNo);
    }
}
