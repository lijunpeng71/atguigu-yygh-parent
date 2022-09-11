package com.atguigu.study.yygh.hospital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author lijunpeng02
 * @date 2022年09月11日 11:33
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.atguigu")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.atguigu")
public class HospitalAppliaction {
    public static void main(String[] args) {
        SpringApplication.run(HospitalAppliaction.class, args);
    }
}
