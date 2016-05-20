package com.truck.cms.api.response;



import com.truck.utils.gateway.utils.annotation.Description;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: chendaoliang
 * Date: 2015/12/28
 * Time: 9:18
 * To change this template use File | Settings | File and Code Templates.
 */
@Description("CMS Databinding")
public class DatabindingInfo implements Serializable {

    private static final long serialVersionUID = 3030978263259760597L;

    @Description("页面ID")
    public int pageId;
    @Description("模块ID")
    public int moduleId;
    @Description("绑定ID")
    public int databindingId;
    @Description("绑定排序")
    public int sort;
    @Description("模块类型")
    public String code;
    @Description("模块名称")
    public String name;

    public int getPageId() {
        return pageId;
    }

    public void setPageId(int pageId) {
        this.pageId = pageId;
    }

    public int getModuleId() {
        return moduleId;
    }

    public void setModuleId(int moduleId) {
        this.moduleId = moduleId;
    }

    public int getDatabindingId() {
        return databindingId;
    }

    public void setDatabindingId(int databindingId) {
        this.databindingId = databindingId;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
