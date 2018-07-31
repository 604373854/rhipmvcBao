package com.feit.rhip3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MvcAPP {
    public static void main(String[] args) {
        //SpringApplication.run(MvcAPP.class,args);
        SpringApplication springApplication = new SpringApplication(MvcAPP.class);
        //禁止命令行设置参数
        springApplication.setAddCommandLineProperties(false);
        springApplication.run(args);
    }
}
