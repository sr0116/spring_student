package com.example.alba.mapper;

import com.example.alba.domain.AlbaUser;
import com.example.alba.domain.Gonggo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GonggoMapper {

    List <Gonggo> gonggoList();
    Gonggo selectOneGonggo(int gonggoNo);

    void insertGonggo(Gonggo gonggo);
    void deleteGonggo(int gonggoNo);
    void updateGonggo(Gonggo gonggo);




}
