package com.example.alba.mapper;

import com.example.alba.domain.AlbaUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface AlbaUserMapper {

    List <AlbaUser> albaUserList();

    void insertAlba (AlbaUser albaUser);

    void updateAlba(AlbaUser albaUser);

    void deleteAlba (int userNo);
// 단일 조회
    AlbaUser selectOneAlba(int userNo) ;


}
