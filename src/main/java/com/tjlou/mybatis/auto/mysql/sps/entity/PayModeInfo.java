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
 * 支付方式信息表
 * </p>
 *
 * @author Gaby
 * @since 2019-10-25
 */
@TableName("pay_mode_info")
public class PayModeInfo implements Serializable, IEntity {

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 支付名称
     */
    private String name;
    /**
     * 提示内容
     */
    private String cue;
    /**
     * 图标
     */
    private String icon;
    /**
     * 编码
     */
    private String code;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 修改时间
     */
    @TableField("modify_time")
    private Date modifyTime;
    /**
     * 状态
     */
    private String status;
    /**
     * 备注
     */
    private String comment;
    /**
     * 类型  0-余额支付  1-微信支付
     */
    private Integer type;

    public Long getId() {
        return id;
    }

    public PayModeInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public PayModeInfo setName(String name) {
        if (name != null)
            name = name.trim();
        this.name = name;
        return this;
    }

    public String getCue() {
        return cue;
    }

    public PayModeInfo setCue(String cue) {
        if (cue != null)
            cue = cue.trim();
        this.cue = cue;
        return this;
    }

    public String getIcon() {
        return icon;
    }

    public PayModeInfo setIcon(String icon) {
        if (icon != null)
            icon = icon.trim();
        this.icon = icon;
        return this;
    }

    public String getCode() {
        return code;
    }

    public PayModeInfo setCode(String code) {
        if (code != null)
            code = code.trim();
        this.code = code;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public PayModeInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public PayModeInfo setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public PayModeInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public PayModeInfo setComment(String comment) {
        if (comment != null)
            comment = comment.trim();
        this.comment = comment;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public PayModeInfo setType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "pay_mode_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 支付名称
     */
    public static final String NAME = "name";

    /**
     * 提示内容
     */
    public static final String CUE = "cue";

    /**
     * 图标
     */
    public static final String ICON = "icon";

    /**
     * 编码
     */
    public static final String CODE = "code";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 修改时间
     */
    public static final String MODIFY_TIME = "modify_time";

    /**
     * 状态
     */
    public static final String STATUS = "status";

    /**
     * 备注
     */
    public static final String COMMENT = "comment";

    /**
     * 类型  0-余额支付  1-微信支付
     */
    public static final String TYPE = "type";

    @Override
    public PayModeInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

