package com.truck.cms;

import com.truck.cms.api.CouponDetailService;
import com.truck.common.config.MyBatisConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2016-04-21.
 */
@RestController
@SpringBootApplication
@Import({MyBatisConfiguration.class})
public class Application {

    @Autowired
    CouponDetailService couponDetailService;


    @RequestMapping("/test")
    public String test(){
        couponDetailService.initCouponDetail();
        return "success";
    }


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
