package com.truck.cms.component;

import com.github.pagehelper.PageHelper;
import com.truck.base.entities.cms.CouponDetailMlh;
import com.truck.base.entities.cms.CouponDetailMlhExample;
import com.truck.base.repositories.cms.CouponDetailMlhMapper;
import com.truck.cms.api.CouponDetailService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Administrator on 2016-04-21.
 */
@Api("优惠相关API")
@Component
@Service
public class CouponDetailComponent implements CouponDetailService {

    Logger logger = Logger.getLogger(CouponDetailComponent.class);

    @Autowired
    private CouponDetailMlhMapper mlhMapper;

    @ApiOperation(value = "获取详情", notes = "测试获取详情")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "xValue", dataType = "int", required = true,value = "查询值", defaultValue = "588"),
            @ApiImplicitParam(paramType = "query", name = "pageNo", dataType = "int", required = true,value = "页码", defaultValue = "1"),
            @ApiImplicitParam(paramType = "query", name = "pageSize", dataType = "int", required = true,value = "每页数量", defaultValue = "10")
    })
    @RequestMapping(value = "api/coupon", method = RequestMethod.GET)
    @Override
    public void getCouponDetail(int xValue,int pageNo,int pageSize) {
        logger.info("==================Init CouponDetail Success");
        PageHelper.startPage(pageNo,pageSize);
        CouponDetailMlhExample example = new CouponDetailMlhExample();
        example.createCriteria().andXValueEqualTo(xValue);
        List<CouponDetailMlh> list = mlhMapper.selectByExample(example);
        logger.info("+++++++++++++++++" + list.size());
        for(CouponDetailMlh c:list){
            logger.info("++++++++++"+c.getRuleId());
        }
    }
}
