package com.example.alba.mapper;

import com.example.alba.domain.Apply;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ApplyMapper {

    List <Apply> applyList();

    Apply selectOneApply(int applyNo);

    void insertApply(Apply apply);
    void deleteApply(int applyNo);
    void updateApply(Apply apply);




}
