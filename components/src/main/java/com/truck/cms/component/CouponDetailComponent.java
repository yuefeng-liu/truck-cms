package com.truck.cms.component;

import com.github.pagehelper.PageHelper;
import com.truck.base.entities.cms.CouponDetailMlh;
import com.truck.base.entities.cms.CouponDetailMlhExample;
import com.truck.base.repositories.cms.CouponDetailMlhMapper;
import com.truck.cms.api.CouponDetailService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016-04-21.
 */
@Service
public class CouponDetailComponent implements CouponDetailService {

    Logger logger = Logger.getLogger(CouponDetailComponent.class);

    @Autowired
    private CouponDetailMlhMapper mlhMapper;

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
