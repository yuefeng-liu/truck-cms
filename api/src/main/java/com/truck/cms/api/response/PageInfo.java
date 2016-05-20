package com.truck.cms.api.response;



import com.truck.utils.gateway.utils.annotation.Description;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: chendaoliang
 * Date: 2015/12/24
 * Time: 16:32
 * To change this template use File | Settings | File and Code Templates.
 */
@Description("CMS页面")
public class PageInfo implements Serializable {

    public static final long serialVersionUID = 8603546283147637912L;
    @Description("页面ID")
    public int pageId;
    @Description("设备ID")
    public int deviceId;
    @Description("设备名称")
    public String deviceName;
    @Description("页面名称")
    public String name;
    @Description("页面类别ID")
    public int categoryId;
    @Description("页面类别名称")
    public String categoryName;
    @Description("页面标题")
    public String title;
    @Description("页面关键字")
    public String keywords;
    @Description("页面描述")
    public String description;
    @Description("基础JSON代码")
    public String elements;
    @Description("分享链接")
    public String shareUrl;
    @Description("分享图片")
    public String shareImage;
    @Description("分享内容")
    public String shareContent;
    @Description("分享标题")
    public String shareTitle;


    public int getPageId() {
        return pageId;
    }

    public void setPageId(int pageId) {
        this.pageId = pageId;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getElements() {
        return elements;
    }

    public void setElements(String elements) {
        this.elements = elements;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getShareUrl() {
        return shareUrl;
    }

    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
    }

    public String getShareImage() {
        return shareImage;
    }

    public void setShareImage(String shareImage) {
        this.shareImage = shareImage;
    }

    public String getShareContent() {
        return shareContent;
    }

    public void setShareContent(String shareContent) {
        this.shareContent = shareContent;
    }

    public String getShareTitle() {
        return shareTitle;
    }

    public void setShareTitle(String shareTitle) {
        this.shareTitle = shareTitle;
    }
}


