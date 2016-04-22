package com.truck.cms.controller;

import com.truck.cms.api.CouponDetailService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2016-04-22.
 */
@Api("优惠相关API")
@RestController
@RequestMapping(value = "api")
public class CouponController {

    @Autowired
    CouponDetailService couponDetailService;


    @ApiOperation(value = "获取详情", notes = "测试获取详情")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "xValue", dataType = "int", required = true,value = "查询值", defaultValue = "588"),
            @ApiImplicitParam(paramType = "query", name = "pageNo", dataType = "int", required = true,value = "页码", defaultValue = "1"),
            @ApiImplicitParam(paramType = "query", name = "pageSize", dataType = "int", required = true,value = "每页数量", defaultValue = "10")
    })
    @RequestMapping(value = "/coupon", method = RequestMethod.GET)
    public String getCoupon(@RequestParam("xValue") int xValue,@RequestParam("pageNo")  int pageNo,@RequestParam("pageSize")  int pageSize){
        couponDetailService.getCouponDetail(xValue, pageNo, pageSize);
        return "success";
    }

    @ApiOperation("获取详情信息")
    @RequestMapping(value = "/coupons", method = RequestMethod.GET)
    @ApiResponses({
         @ApiResponse(code=400,message="请求参数没填好"),
         @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    public String getCoupons(
            @ApiParam(required = true, value = "值") @RequestParam("xValue") int xValue,
            @RequestParam("pageNo")  int pageNo,
            @RequestParam("pageSize")  int pageSize){
        couponDetailService.getCouponDetail(xValue, pageNo, pageSize);
        return "success";
    }
}
