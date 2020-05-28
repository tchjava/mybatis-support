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
 * 请求日志信息表(新)
 * </p>
 *
 * @author Gaby
 * @since 2020-05-13
 */
@TableName("request_log_info")
public class RequestLogInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 请求路径
     */
    @TableField("request_path")
    private String requestPath;
    /**
     * 耗时毫秒
     */
    private Integer consume;
    /**
     * 用户标识
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 请求的客户端 1-小程序 2-IOS 4-安卓 8-公众号 16-H5
     */
    private Integer client;
    /**
     * os系统 1-小程序  2-app项目  3-后台系统 4-文案系统
     */
    private Integer os;
    /**
     * ip地址
     */
    private String ip;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;


    public Long getId() {
        return id;
    }

    public RequestLogInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getRequestPath() {
        return requestPath;
    }

    public RequestLogInfo setRequestPath(String requestPath) {
        if (requestPath != null)
            requestPath = requestPath.trim();
        this.requestPath = requestPath;
        return this;
    }

    public Integer getConsume() {
        return consume;
    }

    public RequestLogInfo setConsume(Integer consume) {
        this.consume = consume;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public RequestLogInfo setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Integer getClient() {
        return client;
    }

    public RequestLogInfo setClient(Integer client) {
        this.client = client;
        return this;
    }

    public Integer getOs() {
        return os;
    }

    public RequestLogInfo setOs(Integer os) {
        this.os = os;
        return this;
    }

    public String getIp() {
        return ip;
    }

    public RequestLogInfo setIp(String ip) {
        if (ip != null)
            ip = ip.trim();
        this.ip = ip;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public RequestLogInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "request_log_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 请求路径
     */
    public static final String REQUEST_PATH = "request_path";

    /**
     * 耗时毫秒
     */
    public static final String CONSUME = "consume";

    /**
     * 用户标识
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 请求的客户端 1-小程序 2-IOS 4-安卓 8-公众号 16-H5
     */
    public static final String CLIENT = "client";

    /**
     * os系统 1-小程序  2-app项目  3-后台系统 4-文案系统
     */
    public static final String OS = "os";

    /**
     * ip地址
     */
    public static final String IP = "ip";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";


    @Override
    public RequestLogInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}
