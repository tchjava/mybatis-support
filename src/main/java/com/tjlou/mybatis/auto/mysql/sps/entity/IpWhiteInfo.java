package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * ip白名单
 * </p>
 *
 * @author Gaby
 * @since 2021-01-25
 */
@TableName("ip_white_info")
public class IpWhiteInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * ip地址
     */
    private String ip;


    public Long getId() {
        return id;
    }

    public IpWhiteInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getIp() {
        return ip;
    }

    public IpWhiteInfo setIp(String ip) {
        if (ip != null)
            ip = ip.trim();
        this.ip = ip;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "ip_white_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * ip地址
     */
    public static final String IP = "ip";


    @Override
    public IpWhiteInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

