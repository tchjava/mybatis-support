package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 请求参数日志表
 * </p>
 *
 * @author Gaby
 * @since 2019-09-02
 */
@TableName("request_log")
public class RequestLog implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 请求路径
     */
    @TableField("request_path")
    private String requestPath;
    /**
     * 请求参数
     */
    private String params;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 消耗毫秒值
     */
    private Long consume;
    /**
     * 错误标记
     */
    private String message;

    public Integer getId() {
        return id;
    }

    public RequestLog setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getRequestPath() {
        return requestPath;
    }

    public RequestLog setRequestPath(String requestPath) {
        if (requestPath != null)
            requestPath = requestPath.trim();
        this.requestPath = requestPath;
        return this;
    }

    public String getParams() {
        return params;
    }

    public RequestLog setParams(String params) {
        if (params != null)
            params = params.trim();
        this.params = params;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public RequestLog setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Long getConsume() {
        return consume;
    }

    public RequestLog setConsume(Long consume) {
        this.consume = consume;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public RequestLog setMessage(String message) {
        if (message != null)
            message = message.trim();
        this.message = message;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "request_log";
    public static final String ID = "id";

    /**
     * 请求路径
     */
    public static final String REQUEST_PATH = "request_path";

    /**
     * 请求参数
     */
    public static final String PARAMS = "params";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 消耗毫秒值
     */
    public static final String CONSUME = "consume";

    /**
     * 错误标记
     */
    public static final String MESSAGE = "message";

    @Override
    public RequestLog pkVal(Serializable val) {
        this.id = Integer.valueOf(val.toString());
        return this;
    }
}

