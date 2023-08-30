package com.phq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RpcguideCourseApplication {

    public static void main(String[] args) {

//生成 密码"abc123" bCrypt加密的密文
//        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
//        String abc123 = bCryptPasswordEncoder.encode("abc123");
//        System.out.println("密码是"+abc123);

        SpringApplication.run(RpcguideCourseApplication.class, args);
    }

}
