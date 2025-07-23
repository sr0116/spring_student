package com.example.alba.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Alias("apply")
public class Apply {
    private int gonggoNo;
    private int resumeNo;
    private LocalDateTime applyDate;
    private int applyNo; // 1: 접수, 2: 등록
    private int userNo;
}