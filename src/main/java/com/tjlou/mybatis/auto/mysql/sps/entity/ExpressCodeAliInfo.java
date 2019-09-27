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
 * 阿里物流信息表
 * </p>
 *
 * @author Gaby
 * @since 2019-09-27
 */
@TableName("express_code_ali_info")
public class ExpressCodeAliInfo implements Serializable, IEntity {

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 物流单号
     */
    private String code;
    /**
     * 物流名称
     */
    private String name;
    /**
     * 状态 00A-生效  00Z-失效
     */
    private String status;
    /**
     * 生效时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 失效时间
     */
    @TableField("expire_time")
    private Date expireTime;
    /**
     * 备注
     */
    private String comment;

    public Long getId() {
        return id;
    }

    public ExpressCodeAliInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getCode() {
        return code;
    }

    public ExpressCodeAliInfo setCode(String code) {
        if (code != null)
            code = code.trim();
        this.code = code;
        return this;
    }

    public String getName() {
        return name;
    }

    public ExpressCodeAliInfo setName(String name) {
        if (name != null)
            name = name.trim();
        this.name = name;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public ExpressCodeAliInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public ExpressCodeAliInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public ExpressCodeAliInfo setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public ExpressCodeAliInfo setComment(String comment) {
        if (comment != null)
            comment = comment.trim();
        this.comment = comment;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "express_code_ali_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 物流单号
     */
    public static final String CODE = "code";

    /**
     * 物流名称
     */
    public static final String NAME = "name";

    /**
     * 状态 00A-生效  00Z-失效
     */
    public static final String STATUS = "status";

    /**
     * 生效时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 失效时间
     */
    public static final String EXPIRE_TIME = "expire_time";

    /**
     * 备注
     */
    public static final String COMMENT = "comment";

    @Override
    public ExpressCodeAliInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

