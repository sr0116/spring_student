package com.example.alba;

import com.example.alba.ui.AlbaUI;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.alba.mapper")
public class AlbaApplication {

    public static void main(String[] args) {
        org.springframework.context.ApplicationContext ctx = SpringApplication.run(AlbaApplication.class, args);
        AlbaUI albaUI = (AlbaUI) ctx.getBean(AlbaUI.class);
        System.out.println("세상 모든 알바, 알바존");
        albaUI.run();

    }

}
