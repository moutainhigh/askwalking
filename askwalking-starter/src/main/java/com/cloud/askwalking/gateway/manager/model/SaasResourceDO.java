package com.cloud.askwalking.gateway.manager.model;

import java.io.Serializable;
import java.util.Date;

public class SaasResourceDO implements Serializable {
    /**
     * 
     * 表字段 : gw_saas_resource.id
     */
    private String id;

    /**
     * 商户id
     * 表字段 : gw_saas_resource.open_id
     */
    private String openId;

    /**
     * 通过URI映射不同的dubbo service此不可重复
     * 表字段 : gw_saas_resource.request_uri
     */
    private String requestUri;

    /**
     * 到期时间
     * 表字段 : gw_saas_resource.expire_time
     */
    private Date expireTime;

    /**
     * 资源接入状态，1-准入/2-禁止
     * 表字段 : gw_saas_resource.status
     */
    private Byte status;

    /**
     * 0-未删除,1-已删除
     * 表字段 : gw_saas_resource.delete_flag
     */
    private Boolean deleteFlag;

    /**
     * 操作人
     * 表字段 : gw_saas_resource.operator
     */
    private String operator;

    /**
     * 更新时间
     * 表字段 : gw_saas_resource.update_time
     */
    private Date updateTime;

    /**
     * 创建时间
     * 表字段 : gw_saas_resource.create_time
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table gw_saas_resource
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取  字段:gw_saas_resource.id
     *
     * @return gw_saas_resource.id, 
     */
    public String getId() {
        return id;
    }

    /**
     * 设置  字段:gw_saas_resource.id
     *
     * @param id the value for gw_saas_resource.id, 
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取 商户id 字段:gw_saas_resource.open_id
     *
     * @return gw_saas_resource.open_id, 商户id
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * 设置 商户id 字段:gw_saas_resource.open_id
     *
     * @param openId the value for gw_saas_resource.open_id, 商户id
     */
    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    /**
     * 获取 通过URI映射不同的dubbo service此不可重复 字段:gw_saas_resource.request_uri
     *
     * @return gw_saas_resource.request_uri, 通过URI映射不同的dubbo service此不可重复
     */
    public String getRequestUri() {
        return requestUri;
    }

    /**
     * 设置 通过URI映射不同的dubbo service此不可重复 字段:gw_saas_resource.request_uri
     *
     * @param requestUri the value for gw_saas_resource.request_uri, 通过URI映射不同的dubbo service此不可重复
     */
    public void setRequestUri(String requestUri) {
        this.requestUri = requestUri == null ? null : requestUri.trim();
    }

    /**
     * 获取 到期时间 字段:gw_saas_resource.expire_time
     *
     * @return gw_saas_resource.expire_time, 到期时间
     */
    public Date getExpireTime() {
        return expireTime;
    }

    /**
     * 设置 到期时间 字段:gw_saas_resource.expire_time
     *
     * @param expireTime the value for gw_saas_resource.expire_time, 到期时间
     */
    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    /**
     * 获取 资源接入状态，1-准入/2-禁止 字段:gw_saas_resource.status
     *
     * @return gw_saas_resource.status, 资源接入状态，1-准入/2-禁止
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置 资源接入状态，1-准入/2-禁止 字段:gw_saas_resource.status
     *
     * @param status the value for gw_saas_resource.status, 资源接入状态，1-准入/2-禁止
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取 0-未删除,1-已删除 字段:gw_saas_resource.delete_flag
     *
     * @return gw_saas_resource.delete_flag, 0-未删除,1-已删除
     */
    public Boolean getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * 设置 0-未删除,1-已删除 字段:gw_saas_resource.delete_flag
     *
     * @param deleteFlag the value for gw_saas_resource.delete_flag, 0-未删除,1-已删除
     */
    public void setDeleteFlag(Boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    /**
     * 获取 操作人 字段:gw_saas_resource.operator
     *
     * @return gw_saas_resource.operator, 操作人
     */
    public String getOperator() {
        return operator;
    }

    /**
     * 设置 操作人 字段:gw_saas_resource.operator
     *
     * @param operator the value for gw_saas_resource.operator, 操作人
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * 获取 更新时间 字段:gw_saas_resource.update_time
     *
     * @return gw_saas_resource.update_time, 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置 更新时间 字段:gw_saas_resource.update_time
     *
     * @param updateTime the value for gw_saas_resource.update_time, 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取 创建时间 字段:gw_saas_resource.create_time
     *
     * @return gw_saas_resource.create_time, 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置 创建时间 字段:gw_saas_resource.create_time
     *
     * @param createTime the value for gw_saas_resource.create_time, 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}