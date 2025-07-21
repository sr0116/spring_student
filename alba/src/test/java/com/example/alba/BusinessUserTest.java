package com.example.alba;

import com.example.alba.domain.AlbaUser;
import com.example.alba.domain.BusinessUser;
import com.example.alba.mapper.AlbaUserMapper;
import com.example.alba.mapper.BusinessUserMapper;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@MapperScan("com.example.alba.mapper")
public class BusinessUserTest {

    @Autowired
    BusinessUserMapper mapper;

    @Test
    public void testExist() {
        System.out.println(mapper);
    }

    @Test
    public void testList() {
        List<BusinessUser> users = mapper.businessUserList();
        System.out.println(users);
    }

    @Test
    public void testSelectOne() {
       int userNo = 4;
       BusinessUser user = mapper.selectOneBusiness(userNo);

        System.out.println(user);
    }

    @Test
    public void testInsertBuniness(){
        BusinessUser businessUser = new BusinessUser().builder()
                .name("테스트용 사업자")
                .tel("00-9999-9999")
                .id("test")
                .pw("test123")
                .area("부산")
                .companyName("test")
                .companyNumber("02-2222-4444")
                .build();

        mapper.insertBusiness(businessUser);
    }

    @Test
    public void testmodify(){
        int userNo = 4;
        BusinessUser businessUser = BusinessUser.builder()
                .userNo(userNo)
                .name("사업자")
                .tel("00-9999-9999")
                .id("test")
                .pw("test123")
                .area("부산")
                .companyName("test")
                .companyNumber("02-2222-4444")
                .build();

        mapper.updateBusiness(businessUser);
    }

    @Test
    public void remeve(){
        int userNo = 2;
        mapper.deleteBusiness(userNo);
    }

}
