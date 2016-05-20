package com.truck.cms.api.errors;


import com.truck.utils.gateway.utils.entity.AbstractReturnCode;

/**
 * Created by Rocky on 15/12/30.
 */
public class PageErrorCodes extends AbstractReturnCode {
    public PageErrorCodes(String desc, int code) {
        super(desc, code);
    }

    public static final int UNDIFINED_TYPE_CODE = 30101;
    public static final PageErrorCodes UNDIFINED_TYPE = new PageErrorCodes("无效的 type 值",UNDIFINED_TYPE_CODE);

    public static final int PAGE_NOT_FOUND_CODE = 30102;
    public static final PageErrorCodes PAGE_NOT_FOUND = new PageErrorCodes("页面没有找到",PAGE_NOT_FOUND_CODE);
}
