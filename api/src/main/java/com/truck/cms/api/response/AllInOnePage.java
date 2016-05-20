package com.truck.cms.api.response;


import com.truck.utils.gateway.utils.annotation.Description;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Rocky on 15/12/30.
 */
@Description("页面信息")
public class AllInOnePage implements Serializable{

    @Description("页面标题")
    public String title;
    @Description("页面描述")
    public String description;
    @Description("关键字")
    public String keyWords;
    @Description("组件定义")
    public List<Definition> definitions;
    @Description("组件数据")
    public List<Item> items;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
    }

    public List<Definition> getDefinitions() {
        return definitions;
    }

    public void setDefinitions(List<Definition> definitions) {
        this.definitions = definitions;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public String getElements() {
        return elements;
    }

    public void setElements(String elements) {
        this.elements = elements;
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
