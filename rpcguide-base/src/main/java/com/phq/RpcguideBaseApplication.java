package com.phq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class RpcguideBaseApplication {

    public static void main(String[] args) {
//        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
//        String abc123 = bCryptPasswordEncoder.encode("abc123");
//        System.out.println("密码是"+abc123);
        SpringApplication.run(RpcguideBaseApplication.class, args);
    }

}
