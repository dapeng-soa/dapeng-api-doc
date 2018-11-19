package com.github.dapeng.api.doc.dto;

/**
 * @author struy
 */
public class TestTemplateVo {

    private String id;
    /**
     * 服务名
     */
    private String serviceName;
    /**
     * 服务版本
     */
    private String version;
    /**
     * 方法名
     */
    private String method;
    /**
     * 请求json串
     */
    private String template;
    /**
     * 模版标签名
     */
    private String label;
    private java.sql.Timestamp createDate;
    private java.sql.Timestamp updateDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }


    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }


    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public java.sql.Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(java.sql.Timestamp createDate) {
        this.createDate = createDate;
    }


    public java.sql.Timestamp getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(java.sql.Timestamp updateDate) {
        this.updateDate = updateDate;
    }

}
