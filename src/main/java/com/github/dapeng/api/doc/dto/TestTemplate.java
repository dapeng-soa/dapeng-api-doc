package com.github.dapeng.api.doc.dto;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Clob;

/**
 * @author struy
 */
@Entity
@Table(name = "test_template")
public class TestTemplate {

    @Id
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
    private Clob template;
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


    public Clob getTemplate() {
        return template;
    }

    public void setTemplate(Clob template) {
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
