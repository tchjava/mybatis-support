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
 * 拍卖-字节跳动推送广告记录表
 * </p>
 *
 * @author Gaby
 * @since 2020-09-25
 */
@TableName("auction_byte_run_log")
public class AuctionByteRunLog implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 广告计划id
     */
    private String aid;
    /**
     * 广告创意 id
     */
    private String cid;
    /**
     * IOS 6+的设备id字段
     */
    private String idfa;
    /**
     * ip地址
     */
    private String ip;
    /**
     * 操作系统
     */
    private Integer os;
    /**
     * 详细信息
     */
    private String message;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 事件类型
     */
    @TableField("event_type")
    private Integer eventType;
    /**
     * 回调地址
     */
    @TableField("callback_url")
    private String callbackUrl;
    /**
     * androidId
     */
    @TableField("android_id")
    private String androidId;
    /**
     * imei  android的MD5摘要
     */
    private String imei;
    /**
     * 是否已删除 0-未删除 1-已删除
     */
    private Integer del;


    public Long getId() {
        return id;
    }

    public AuctionByteRunLog setId(Long id) {
        this.id = id;
        return this;
    }

    public String getAid() {
        return aid;
    }

    public AuctionByteRunLog setAid(String aid) {
        if (aid != null)
            aid = aid.trim();
        this.aid = aid;
        return this;
    }

    public String getCid() {
        return cid;
    }

    public AuctionByteRunLog setCid(String cid) {
        if (cid != null)
            cid = cid.trim();
        this.cid = cid;
        return this;
    }

    public String getIdfa() {
        return idfa;
    }

    public AuctionByteRunLog setIdfa(String idfa) {
        if (idfa != null)
            idfa = idfa.trim();
        this.idfa = idfa;
        return this;
    }

    public String getIp() {
        return ip;
    }

    public AuctionByteRunLog setIp(String ip) {
        if (ip != null)
            ip = ip.trim();
        this.ip = ip;
        return this;
    }

    public Integer getOs() {
        return os;
    }

    public AuctionByteRunLog setOs(Integer os) {
        this.os = os;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public AuctionByteRunLog setMessage(String message) {
        if (message != null)
            message = message.trim();
        this.message = message;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public AuctionByteRunLog setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Integer getEventType() {
        return eventType;
    }

    public AuctionByteRunLog setEventType(Integer eventType) {
        this.eventType = eventType;
        return this;
    }

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public AuctionByteRunLog setCallbackUrl(String callbackUrl) {
        if (callbackUrl != null)
            callbackUrl = callbackUrl.trim();
        this.callbackUrl = callbackUrl;
        return this;
    }

    public String getAndroidId() {
        return androidId;
    }

    public AuctionByteRunLog setAndroidId(String androidId) {
        if (androidId != null)
            androidId = androidId.trim();
        this.androidId = androidId;
        return this;
    }

    public String getImei() {
        return imei;
    }

    public AuctionByteRunLog setImei(String imei) {
        if (imei != null)
            imei = imei.trim();
        this.imei = imei;
        return this;
    }

    public Integer getDel() {
        return del;
    }

    public AuctionByteRunLog setDel(Integer del) {
        this.del = del;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_byte_run_log";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 广告计划id
     */
    public static final String AID = "aid";

    /**
     * 广告创意 id
     */
    public static final String CID = "cid";

    /**
     * IOS 6+的设备id字段
     */
    public static final String IDFA = "idfa";

    /**
     * ip地址
     */
    public static final String IP = "ip";

    /**
     * 操作系统
     */
    public static final String OS = "os";

    /**
     * 详细信息
     */
    public static final String MESSAGE = "message";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 事件类型
     */
    public static final String EVENT_TYPE = "event_type";

    /**
     * 回调地址
     */
    public static final String CALLBACK_URL = "callback_url";

    /**
     * androidId
     */
    public static final String ANDROID_ID = "android_id";

    /**
     * imei  android的MD5摘要
     */
    public static final String IMEI = "imei";

    /**
     * 是否已删除 0-未删除 1-已删除
     */
    public static final String DEL = "del";


    @Override
    public AuctionByteRunLog pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

