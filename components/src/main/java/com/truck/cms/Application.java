package com.truck.cms;

import com.truck.common.config.mybatis.MyBatisConfiguration;
import com.truck.common.config.swagger.SwaggerApiConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by Administrator on 2016-04-21.
 */
@SpringBootApplication
@Import({MyBatisConfiguration.class})
@EnableSwagger2
//@Import({MyBatisConfiguration.class, SwaggerApiConfig.class})
@ImportResource("classpath:/dubbo-provider.xml")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
