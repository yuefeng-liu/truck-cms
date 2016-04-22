package com.truck.cms;

import com.truck.common.config.mybatis.MyBatisConfiguration;
import com.truck.common.config.swagger.SwaggerApiConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * Created by Administrator on 2016-04-21.
 */
@SpringBootApplication
@Import({MyBatisConfiguration.class, SwaggerApiConfig.class})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
