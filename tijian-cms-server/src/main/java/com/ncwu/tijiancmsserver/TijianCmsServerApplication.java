package com.ncwu.tijiancmsserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/**
 * @MapperScan 配置Mybatis的包扫描
 * basePackages 用于指定所有MyBatis的SQL映射接口所在包路径，取值为路径
 */
@MapperScan("com.ncwu.tijiancmsserver.mapper")
public class TijianCmsServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TijianCmsServerApplication.class, args);
    }

}
