package com.truck.cms.component;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.truck.base.entities.cms.CouponDetailMlh;
import com.truck.base.entities.cms.CouponDetailMlhExample;
import com.truck.base.repositories.cms.CouponDetailMlhMapper;
import com.truck.cms.api.CouponDetailService;
import com.truck.utils.gateway.utils.annotation.ApiParameter;
import com.truck.utils.gateway.utils.entity.ServiceException;
import io.swagger.annotations.Api;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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


    @Override
    public void getCouponDetail(@ApiParameter(required = true, name = "xValue", desc = "value值") int xValue,
                                @ApiParameter(required = true, name = "pageNo", desc = "页码") int pageNo,
                                @ApiParameter(required = true, name = "pageSize", desc = "页面大小") int pageSize) throws ServiceException {
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
