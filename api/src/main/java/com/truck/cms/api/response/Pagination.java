package com.truck.cms.api.response;



import com.truck.utils.gateway.utils.annotation.Description;

import java.io.Serializable;
import java.util.List;

/**
 * 包装分页返回的结果
 * Created with IntelliJ IDEA.
 * User: chendaoliang
 * Date: 2016-01-07
 * Time: 14:32
 * To change this template use File | Settings | File and Code Templates.
 */
@Description("CMS页面分页")
public class Pagination implements Serializable {

    private static final long serialVersionUID = -6987858119560639299L;

    @Description("页面List")
    public List<PageInfo> list;

    @Description("页面总数")
    public int count;

    public Pagination() {
    }

    public Pagination(List<PageInfo> list, int count) {
        this.list = list;
        this.count = count;
    }

    public List<PageInfo> getList() {
        return list;
    }

    public void setList(List<PageInfo> list) {
        this.list = list;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
