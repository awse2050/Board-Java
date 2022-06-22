package com.multi.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan("com.multi.core")
@SpringBootApplication
// 타 모듈 환경설정 적용방법 1
//@PropertySource({"classpath:application-core.properties"})
public class MultiModuleJavaApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MultiModuleJavaApiApplication.class, args);
    }

}
