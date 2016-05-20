package com.truck.cms.api.response;



import com.truck.utils.gateway.utils.annotation.Description;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: chendaoliang
 * Date: 2015/12/28
 * Time: 14:48
 * To change this template use File | Settings | File and Code Templates.
 */
@Description("CMS模块")
public class ModuleInfo implements Serializable {
    private static final long serialVersionUID = 3030978263259760597L;

    @Description("绑定数据ID")
    public int id;
    @Description("模块Id")
    public int moduleId;
    @Description("模块名称")
    public String name;
    @Description("模块code")
    public String code;
    @Description("设备Id")
    public int deviceId;
    @Description("设备名称")
    public String deviceName;
//    @Description("组件模块")
//    public String module;









    public int getModuleId() {
        return moduleId;
    }

    public void setModuleId(int moduleId) {
        this.moduleId = moduleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
