package com.example.alba.mapper;

import com.example.alba.domain.AlbaUser;
import com.example.alba.domain.BusinessUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BusinessUserMapper {

    List <BusinessUser> businessUserList();

    BusinessUser selectOneBusiness(int userNo);

    void insertBusiness(BusinessUser businessUser);
    void deleteBusiness(int userNo);
    void updateBusiness(BusinessUser businessUser);






}
