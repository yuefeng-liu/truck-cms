package com.truck.cms.api;

import com.truck.cms.api.errors.CmsErrorCodes;
import com.truck.utils.gateway.utils.annotation.ApiGroup;
import com.truck.utils.gateway.utils.annotation.ApiParameter;
import com.truck.utils.gateway.utils.annotation.DesignedErrorCode;
import com.truck.utils.gateway.utils.annotation.HttpApi;
import com.truck.utils.gateway.utils.define.SecurityType;
import com.truck.utils.gateway.utils.entity.ServiceException;

/**
 * Created by Administrator on 2016-04-21.
 */
public interface CouponDetailService {

    @DesignedErrorCode({CmsErrorCodes.PAGE_WARN_PARAM_CODE})
    public void getCouponDetail(
            @ApiParameter(required = true, name = "xValue", desc = "value值") int xValue,
            @ApiParameter(required = true, name = "pageNo", desc = "页码") int pageNo,
            @ApiParameter(required = true, name = "pageSize", desc = "页面大小") int pageSize) throws ServiceException;
}
