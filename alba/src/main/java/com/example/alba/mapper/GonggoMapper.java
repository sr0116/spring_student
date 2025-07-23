package com.example.alba.mapper;

import com.example.alba.domain.Gonggo;
import com.example.alba.domain.dto.GonggoReadDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GonggoMapper {

    List <Gonggo> gonggoList();
    Gonggo selectOneGonggo(int gonggoNo);

    List<GonggoReadDTO> selectAllGonggo();

    void insertGonggo(Gonggo gonggo);
    void deleteGonggo(int gonggoNo);
    void updateGonggo(Gonggo gonggo);




}
