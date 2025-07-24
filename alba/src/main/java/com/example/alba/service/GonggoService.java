package com.example.alba.service;

import com.example.alba.domain.Gonggo;
import com.example.alba.mapper.GonggoMapper;
import org.springframework.stereotype.Service;

@Service
public class GonggoService {
  private GonggoMapper gonggoMapper;

//-- 지원을 위해서는 공고가 필요해
//-- 공고는 누가?
//    -- 사업자 회원이 공고를 등록한다. (GonggoMapper 의 insert)
  public void write(Gonggo gonggo) {
    gonggoMapper.insertGonggo(gonggo);
  }
//    -- 공고를 조회하는 것은 사업자, 알바 회원 전체를 대상으로
//-- 단일, 목록, 조회시 필요정보는?
  public Gonggo read(int no) {
    return gonggoMapper.selectOneGonggo(no);
  }
//
//    -- 공고의 수정은 게시글 작성자가 한다. update
//-- 공고 삭제 (지원자가 존재할 경우 삭제 하면 안됨) 공고 작성자만 삭제 가능


}
