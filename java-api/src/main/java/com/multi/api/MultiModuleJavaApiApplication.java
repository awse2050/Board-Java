package com.multi.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


// 타 모듈 환경설정 적용방법 1
//@PropertySource({"classpath:application-core.properties"})
@EntityScan("com.multi.core")
@EnableJpaRepositories("com.multi.core")
// core 모듈을 포함하여 스프링 빈으로 등록시키 위해서 패키지 탐색범위를 지정한다.
@SpringBootApplication(scanBasePackages = {"com.multi"})
public class MultiModuleJavaApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MultiModuleJavaApiApplication.class, args);
    }

}
