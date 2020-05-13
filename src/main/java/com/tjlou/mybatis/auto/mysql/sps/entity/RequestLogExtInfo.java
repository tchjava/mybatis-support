package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 请求日志拓展信息表(新)
 * </p>
 *
 * @author Gaby
 * @since 2020-05-13
 */
@TableName("request_log_ext_info")
public class RequestLogExtInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 日志标识
     */
    @TableField("log_id")
    private Long logId;
    /**
     * 请求参数
     */
    private String params;
    /**
     * 错误信息
     */
    private String message;


    public Long getId() {
        return id;
    }

    public RequestLogExtInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public RequestLogExtInfo setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public String getParams() {
        return params;
    }

    public RequestLogExtInfo setParams(String params) {
        if (params != null)
            params = params.trim();
        this.params = params;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public RequestLogExtInfo setMessage(String message) {
        if (message != null)
            message = message.trim();
        this.message = message;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "request_log_ext_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 日志标识
     */
    public static final String LOG_ID = "log_id";

    /**
     * 请求参数
     */
    public static final String PARAMS = "params";

    /**
     * 错误信息
     */
    public static final String MESSAGE = "message";


    @Override
    public RequestLogExtInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

