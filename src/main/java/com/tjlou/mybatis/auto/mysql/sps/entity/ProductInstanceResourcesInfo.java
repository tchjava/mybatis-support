package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 拍品实例资源表
 * </p>
 *
 * @author Gaby
 * @since 2020-06-02
 */
@TableName("product_instance_resources_info")
public class ProductInstanceResourcesInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 实例标识
     */
    @TableField("instance_id")
    private Long instanceId;
    /**
     * 路径
     */
    private String url;
    /**
     * 类型  0-图片  1-视频  2-视频截帧
     */
    private Integer type;
    /**
     * 状态 00A-有效  00Z-失效
     */
    private String status;


    public Long getId() {
        return id;
    }

    public ProductInstanceResourcesInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getInstanceId() {
        return instanceId;
    }

    public ProductInstanceResourcesInfo setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public ProductInstanceResourcesInfo setUrl(String url) {
        if (url != null)
            url = url.trim();
        this.url = url;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public ProductInstanceResourcesInfo setType(Integer type) {
        this.type = type;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public ProductInstanceResourcesInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "product_instance_resources_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 实例标识
     */
    public static final String INSTANCE_ID = "instance_id";

    /**
     * 路径
     */
    public static final String URL = "url";

    /**
     * 类型  0-图片  1-视频  2-视频截帧
     */
    public static final String TYPE = "type";

    /**
     * 状态 00A-有效  00Z-失效
     */
    public static final String STATUS = "status";


    @Override
    public ProductInstanceResourcesInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

