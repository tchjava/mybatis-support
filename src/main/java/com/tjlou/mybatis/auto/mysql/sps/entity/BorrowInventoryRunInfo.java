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
 * 清单正在入库实例表
 * </p>
 *
 * @author Gaby
 * @since 2020-05-23
 */
@TableName("borrow_inventory_run_info")
public class BorrowInventoryRunInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 清单标识
     */
    @TableField("inventory_id")
    private Long inventoryId;
    /**
     * 条目标识
     */
    @TableField("inventory_item_id")
    private Long inventoryItemId;
    /**
     * 操作件数
     */
    private Integer num;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;


    public Long getId() {
        return id;
    }

    public BorrowInventoryRunInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getInventoryId() {
        return inventoryId;
    }

    public BorrowInventoryRunInfo setInventoryId(Long inventoryId) {
        this.inventoryId = inventoryId;
        return this;
    }

    public Long getInventoryItemId() {
        return inventoryItemId;
    }

    public BorrowInventoryRunInfo setInventoryItemId(Long inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
        return this;
    }

    public Integer getNum() {
        return num;
    }

    public BorrowInventoryRunInfo setNum(Integer num) {
        this.num = num;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public BorrowInventoryRunInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "borrow_inventory_run_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 清单标识
     */
    public static final String INVENTORY_ID = "inventory_id";

    /**
     * 条目标识
     */
    public static final String INVENTORY_ITEM_ID = "inventory_item_id";

    /**
     * 操作件数
     */
    public static final String NUM = "num";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";


    @Override
    public BorrowInventoryRunInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

