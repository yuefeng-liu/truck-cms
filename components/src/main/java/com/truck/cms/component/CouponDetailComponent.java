package com.truck.cms.component;

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
    public void initCouponDetail() {
        logger.info("==================Init CouponDetail Success");
        CouponDetailMlhExample example = new CouponDetailMlhExample();
        example.createCriteria().andRuleIdEqualTo("229277");
        List<CouponDetailMlh> list = mlhMapper.selectByExample(example);
        logger.info("+++++++++++++++++"+list.size());
    }
}
