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
 * 不可删除图片信息表
 * </p>
 *
 * @author Gaby
 * @since 2020-05-22
 */
@TableName("ban_delete_pic_info")
public class BanDeletePicInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 图片地址
     */
    private String pic;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 类型  1-创建订单  2-发拍
     */
    private Integer type;


    public Long getId() {
        return id;
    }

    public BanDeletePicInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getPic() {
        return pic;
    }

    public BanDeletePicInfo setPic(String pic) {
        if (pic != null)
            pic = pic.trim();
        this.pic = pic;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public BanDeletePicInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public BanDeletePicInfo setType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "ban_delete_pic_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 图片地址
     */
    public static final String PIC = "pic";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 类型  1-创建订单  2-发拍
     */
    public static final String TYPE = "type";


    @Override
    public BanDeletePicInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

