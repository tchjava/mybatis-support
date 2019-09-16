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
 * 分享二维码信息表
 * </p>
 *
 * @author Gaby
 * @since 2019-09-16
 */
@TableName("share_qrcode_info")
public class ShareQrcodeInfo implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 来源标识
     */
    @TableField("source_id")
    private Long sourceId;
    /**
     * 类型  1-奖品  2-商品
     */
    private Integer type;
    /**
     * 二维码地址
     */
    private String qrcode;
    /**
     * 唯一值
     */
    private String key;
    /**
     * 唯一参数值
     */
    private String value;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 更新时间
     */
    @TableField("modify_time")
    private Date modifyTime;

    public Long getId() {
        return id;
    }

    public ShareQrcodeInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getSourceId() {
        return sourceId;
    }

    public ShareQrcodeInfo setSourceId(Long sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public ShareQrcodeInfo setType(Integer type) {
        this.type = type;
        return this;
    }

    public String getQrcode() {
        return qrcode;
    }

    public ShareQrcodeInfo setQrcode(String qrcode) {
        if (qrcode != null)
            qrcode = qrcode.trim();
        this.qrcode = qrcode;
        return this;
    }

    public String getKey() {
        return key;
    }

    public ShareQrcodeInfo setKey(String key) {
        if (key != null)
            key = key.trim();
        this.key = key;
        return this;
    }

    public String getValue() {
        return value;
    }

    public ShareQrcodeInfo setValue(String value) {
        if (value != null)
            value = value.trim();
        this.value = value;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public ShareQrcodeInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public ShareQrcodeInfo setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "share_qrcode_info";
    public static final String ID = "id";

    /**
     * 来源标识
     */
    public static final String SOURCE_ID = "source_id";

    /**
     * 类型  1-奖品  2-商品
     */
    public static final String TYPE = "type";

    /**
     * 二维码地址
     */
    public static final String QRCODE = "qrcode";

    /**
     * 唯一值
     */
    public static final String KEY = "key";

    /**
     * 唯一参数值
     */
    public static final String VALUE = "value";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 更新时间
     */
    public static final String MODIFY_TIME = "modify_time";

    @Override
    public ShareQrcodeInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

