package com.chancetop.automation.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = {"com.chancetop.automation.mappers"})
public class MybatisConfig {
}
