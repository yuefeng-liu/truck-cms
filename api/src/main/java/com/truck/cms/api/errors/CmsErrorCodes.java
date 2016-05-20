package com.truck.cms.api.errors;


import com.truck.utils.gateway.utils.annotation.Description;
import com.truck.utils.gateway.utils.entity.AbstractReturnCode;

@Description("CMS服务错误码定义")
public class CmsErrorCodes extends AbstractReturnCode {

    public CmsErrorCodes(String desc, int code) {
        super(desc, code);
    }

    public static final int PAGE_WARN_PARAM_CODE = 30103;
    public static final CmsErrorCodes  PAGE_WARN_PARAM = new CmsErrorCodes("页面不存在", PAGE_WARN_PARAM_CODE);

    public static final int PAGEADD_WARN_PARAM_CODE = 30104;
    public static final CmsErrorCodes  PAGEADD_WARN_PARAM = new CmsErrorCodes("页面添加失败", PAGEADD_WARN_PARAM_CODE);

    public static final int Module_NOT_FOUND_CODE = 30105;
    public static final CmsErrorCodes  Module_NOT_FOUND = new CmsErrorCodes("组件未找到", Module_NOT_FOUND_CODE);

    public static final int PUBLISH_WARN_PARAM_CODE = 30106;
    public static final CmsErrorCodes PUBLISH_WARN_PARAM = new CmsErrorCodes("发布失败，请检查内容再次发布", PUBLISH_WARN_PARAM_CODE);

    public static final int PREVIEW_WARN_PARAM_CODE = 30107;
    public static final PageErrorCodes PREVIEW_WARN_PARAM = new PageErrorCodes("参数错误，预览页面没有找到", PREVIEW_WARN_PARAM_CODE);
}
