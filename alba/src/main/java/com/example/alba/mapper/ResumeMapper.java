package com.example.alba.mapper;

import com.example.alba.domain.Resume;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ResumeMapper {

    List <Resume> resumeList();

    Resume selectOneResume(int userNo);

    void insertResume(Resume resume);
}
