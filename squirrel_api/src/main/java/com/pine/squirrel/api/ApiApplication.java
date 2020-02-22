package com.pine.squirrel.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 赵松
 * @date
 */
@SpringBootApplication(scanBasePackages = {"com.pine.squirrel.infra.dao"})
public class ApiApplication {
    public static void main(String []args){
        SpringApplication.run(ApiApplication.class, args);
    }

}
