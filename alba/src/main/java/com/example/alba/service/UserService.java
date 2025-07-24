package com.example.alba.service;

import com.example.alba.domain.User;
import com.example.alba.mapper.UserMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
  private UserMapper userMapper;

  // 회원가입 (2종류)
  public void register(User user) {
    userMapper.insertUser(user);
  }

  public void modify(User user) {
    userMapper.updateUser(user);
  }
  public User findById(String id, String pw) {
    return userMapper.findById(id, pw);
  }

  public boolean readById (String id, String pw) {
    User user = findById(id, pw);
    if (user != null) {
      return findById(id, pw).getPw().equals(pw);
    }
    return false;
  }

  public User read(int no) {
    return userMapper.selectOneUser(no);
  }

  public void delete(int no) {
    userMapper.deleteUser(no);
  }

  public List<User> readAll() {
    return userMapper.UserList();
  }
}
