package com.truck.cms.api.response;



import com.truck.utils.gateway.utils.annotation.Description;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Rocky on 15/12/30.
 */
@Description("页面组件")
public class Item  implements Serializable {

    @Description("类型,目前取值为 [newbie-新人必看,seasonals-当季特惠,floors-楼层]")
    public String type;
    @Description("组件属性,具体参考Confluence")
    public String attributes;
    @Description("组件数据,具体参考Confluence")
    //public List<Object> data;
    public String data;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAttributes() {
        return attributes;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
