package com.truck.cms.api.response;



import com.truck.utils.gateway.utils.annotation.Description;

import java.io.Serializable;

/**
 * Created by Rocky on 15/12/30.
 */
@Description("组件定义")
public class Definition  implements Serializable {

    @Description("类型")
    public String type;
    @Description("模板定义")
    public String definition;
    @Description("CSS定义")
    public String defaultCss;
    @Description("css MD5")
    public String cssMd5;
    @Description("JavaScript定义")
    public String defaultJs;
    @Description("JavaScript MD5")
    public String jsMd5;

    public Definition() {
    }

    public Definition(String type, String definition, String defaultCss, String cssMd5, String defaultJs, String jsMd5) {
        this.type = type;
        this.definition = definition;
        this.defaultCss = defaultCss;
        this.cssMd5 = cssMd5;
        this.defaultJs = defaultJs;
        this.jsMd5 = jsMd5;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getDefaultCss() {
        return defaultCss;
    }

    public void setDefaultCss(String defaultCss) {
        this.defaultCss = defaultCss;
    }

    public String getCssMd5() {
        return cssMd5;
    }

    public void setCssMd5(String cssMd5) {
        this.cssMd5 = cssMd5;
    }

    public String getDefaultJs() {
        return defaultJs;
    }

    public void setDefaultJs(String defaultJs) {
        this.defaultJs = defaultJs;
    }

    public String getJsMd5() {
        return jsMd5;
    }

    public void setJsMd5(String jsMd5) {
        this.jsMd5 = jsMd5;
    }
}
