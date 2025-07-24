package com.example.alba.ui;

import com.example.alba.domain.User;
import com.example.alba.service.UserService;
import com.example.alba.util.AlbaUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlbaUI {

  private User loginUser;

  @Autowired
  private UserService userService;

  public void run() {
    while (true) {
      int no = AlbaUtil.nextInt("1. 회원가입 2. 로그인  3. 종료 ", s -> s > 0 && s <= 3, "1 ~ 3 사이의 번호를 입력해주세요");
      switch (no) {
        case 1:
          register();
          break;
        case 2:
          login();
          break;
        case 3:
          return;
      }
    }
  }

  public void login() {
    System.out.println("==========================로그인=============================");
    String id = AlbaUtil.nextLine("아이디를 입력하세요>");
    String pw = AlbaUtil.nextLine("비밀번호를 입력하세요>");

    boolean result = userService.readById(id, pw);
    if (result) {
      loginUser = userService.findById(id, pw);
      System.out.println("로그인 되었습니다.");
    } else {
      System.out.println("현재 가입된 아이디가 없거나 비밀번호 틀림");
    }
  }

  // 회원 가입
  public void register() {
    System.out.println("=============== 알바존 !==================");
    User user;// 유저 정보
    if (loginUser == null) {
      int choice = AlbaUtil.nextInt("1. (사업자) 회원가입 2.(개인회원) 회원가입 3. 종료 ");
      switch (choice) {
        case 1:

          System.out.println("==============사업자 회원가입================");

          int memberType = 1;
          // 아이디 , 비밀번호, 연락처, 주소, 이름, 상호명

          String name = AlbaUtil.nextLine("이름을 입력하세요.");

          String comeNum = AlbaUtil.nextLine("\"-\"(하이픈)을 포함하여 사업자 등록번호를 입력해 주세요.ex) 000-00-00000"); // 사업자번호 중복체크, 정규식 넣기

          String companyName = AlbaUtil.nextLine("상호명을 입력하세요.", s -> !s.isEmpty(), "공백이 아닌 상호명을 입력해주세요.");

          String companyNumber = AlbaUtil.nextLine("사업자 전화 번호를 입력하세요.");

          String tel = AlbaUtil.nextLine("\"-\"(하이픈)을 포함하여 전화번호를 입력해주세요.ex) 010-0000-0000");


          String id = AlbaUtil.nextLine("아이디를 입력하세요.\n");

          // 체크
          String pw = AlbaUtil.nextLine("비밀번호를 입력하세요.\n"
            + " 비밀번호는 (!_-)특수문자, 영문자, 숫자로만 구성되어야합니다.");
          if (!pw.equals(AlbaUtil.nextLine("[비밀번호 확인] 비밀번호를 재입력하세요."))) {
            System.out.println("비밀번호가 다릅니다.");
            return;
          }
          String area = AlbaUtil.selectArea();
          // 회원 번호, 이름, 연락처, id, pw, 소재지, 상호, 사업자 등록번호
          System.out.println("회원가입이 정상적으로 완료되었습니다.");
          user = new User(memberType, name, tel, id, pw, area, comeNum, companyName, companyNumber);
          userService.register(user);
          System.out.println("회원가입한 유저 user_no" + user.getUserNo());
          break;

        case 2: // 개인회원

          System.out.println("================일반 회원 회원가입================");
          // 아이디 , 비밀번호, 연락처, 주소, 이름
          // 아이디 , 비밀번호, 연락처, 주소, 이름

          name = AlbaUtil.nextLine("이름을 입력하세요.");

          tel = AlbaUtil.nextLine("\"-\"(하이픈)을 포함하여 전화번호를 입력해주세요.ex) 010-0000-0000");

          id = AlbaUtil.nextLine("아이디를 입력하세요.\n");
          // 체크
          pw = AlbaUtil.nextLine("비밀번호를 입력하세요.\n"
          );

          System.out.println("희망 근무 지역 선택해주세요");
          area = AlbaUtil.selectArea();

          System.out.println("회원가입이 정상적으로 완료되었습니다.");
          user = new User(name, tel, id, pw, area);
          userService.register(user);
          System.out.println("회원가입한 유저 user_no" + user.getUserNo());
          break;
      }
    } else if (loginUser.getMemberType() == 1) {
      int no = AlbaUtil.nextInt("1. 공고 2. 회원정보 조회 3. 회원정보 수정 4. 회원탈퇴 5. 로그아웃", s -> s > 0 && s <= 5, "1 ~ 5 사이의 번호를 입력해주세요");
      switch (no) {
        case 1:
        case 2:

        case 3:
        case 4:
        case 5:

      }
    }
  }
}
