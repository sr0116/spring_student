package com.example.alba.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Alias("gonggo_read_dto")
public class GonggoReadDTO {
  private int gonggoNo;

  private int userNo;// 나중에 조인
  private String companyArea;
  private String companyName;
  private String companyNumber;

  private String title;
  private String role; // boolean 으로 사업자 알바 구분하거나 어떻게 할지 생각
  private int workHours;
  private int wage;
  private LocalDate workingStartDate;
  private LocalDate workingEndDate;
  private boolean state;
  private String comeArea;
  private String tel;
}
