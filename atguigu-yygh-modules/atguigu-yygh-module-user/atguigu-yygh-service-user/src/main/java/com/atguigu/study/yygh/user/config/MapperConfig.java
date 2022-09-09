package com.atguigu.study.yygh.user.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author lijunpeng02
 * @date 2022年09月09日 19:59
 */
@Configuration
@MapperScan("com.atguigu.study.yygh.user.mapper")
public class MapperConfig {
}
