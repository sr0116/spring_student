package com.example.alba;

import com.example.alba.domain.User;
import com.example.alba.mapper.UserMapper;
import com.example.alba.service.UserService;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
@SpringBootTest
@MapperScan("com.example.alba.mapper")
public class UserTest {

    @Autowired
    UserMapper mapper;
  @Autowired
  private UserService userService;

    @Test
    public void testExist() {
        System.out.println(mapper);
    }

    @Test
    public void testList() {
        List<User> users = mapper.UserList();
        System.out.println(users);
    }

    @Test
    public void testInsetAlba(){
        User user = new User().builder()
                .name("테스트")
                .tel("010-2222-1234")
                .id("test")
                .pw("test123")
                .area("서울")
                .companyArea("서울")
                .companyName("추가 등록")
                .companyNumber("02-3333-2222")
                 .memberType(0)
                .build();

        mapper.insertUser(user);
    }

    @Test
    public void testRemoveUser(){
        int userNo = 3;
        mapper.deleteUser(userNo);

    }

    @Test
    public  void testModifyUser(){
        int userNo = 2;
        User user = User.builder()
                .name("테스트")
                .tel("010-2222-1234")
                .id("test")
                .pw("test123")
                .area("서울")
                .companyArea("서울")
                .companyName("추가 등록")
                .companyNumber("02-3333-2222")
                .memberType(1)
                    .build();

        mapper.updateUser(user);
    }

    @Test
    public  void testSelectOne(){
        int userNo = 1;

        User user = mapper.selectOneUser(userNo);

        System.out.println(user);
    }
    @Test
    // 로그인할 때 아이디랑 비밀번호 정보 조회
    public  void testLoginUser(){
        String id = "test3" ;
        String pw = "test123" ;
//        User user = mapper.findById(id);

//        System.out.println(user);

    }
    @Test
    // 로그인할 때 아이디랑 비밀번호 정보 조회
    public  void testFindById(){
        String id = "test3" ;
        String pw = "test1234" ;

//        boolean result = userService.login(id, pw);
//        if (result) {
//            User loginUser = userService.readById(id);
//            System.out.println("로그인 성공");
//        } else {
//            System.out.println("로그인 실패");
//        }
//        User user = mapper.readById(id);
//        System.out.println(user);

    }
}
