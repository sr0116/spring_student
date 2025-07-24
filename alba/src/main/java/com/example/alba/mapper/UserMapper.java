package com.example.alba.mapper;

import com.example.alba.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

  List<User> UserList();

  void insertUser(User user);

  void updateUser(User user);

  void deleteUser(int userNo);

  // 단일 조회
  User selectOneUser(int userNo);

  // 사업자랑 일반회원
//  boolean readById(String id, String pw); 필요가 없다

  User findById(String id, String pw);

}
