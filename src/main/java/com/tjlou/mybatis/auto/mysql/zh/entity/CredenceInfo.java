package com.tjlou.mybatis.auto.mysql.zh.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 凭证信息表
 * </p>
 *
 * @author Gaby
 * @since 2019-06-25
 */
@TableName("credence_info")
public class CredenceInfo implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 记账标识
     */
    @TableField("tally_id")
    private Long tallyId;
    /**
     * 图片路径
     */
    private String path;
    /**
     * 状态  00A-有效  00B-失效
     */
    private String status;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;

    public Long getId() {
        return id;
    }

    public CredenceInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getTallyId() {
        return tallyId;
    }

    public CredenceInfo setTallyId(Long tallyId) {
        this.tallyId = tallyId;
        return this;
    }

    public String getPath() {
        return path;
    }

    public CredenceInfo setPath(String path) {
        if (path != null)
            path = path.trim();
        this.path = path;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public CredenceInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public CredenceInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "credence_info";
    public static final String ID = "id";

    /**
     * 记账标识
     */
    public static final String TALLY_ID = "tally_id";

    /**
     * 图片路径
     */
    public static final String PATH = "path";

    /**
     * 状态  00A-有效  00B-失效
     */
    public static final String STATUS = "status";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    @Override
    public CredenceInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

