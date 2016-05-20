package com.truck.cms.api.response;



import com.truck.utils.gateway.utils.annotation.Description;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: chendaoliang
 * Date: 2015/12/28
 * Time: 9:37
 * To change this template use File | Settings | File and Code Templates.
 */
@Description("CMS数据")
public class DataInfo implements Serializable {

    private static final long serialVersionUID = -7921703548760138226L;
    @Description("模块名称")
    public String name;
    @Description("属性类型")
    public String  attr;
    @Description("数据位数据")
    public String content;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAttr() {
        return attr;
    }

    public void setAttr(String attr) {
        this.attr = attr;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
