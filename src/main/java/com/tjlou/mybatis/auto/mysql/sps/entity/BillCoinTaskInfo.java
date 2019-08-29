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
 * 金币任务信息表
 * </p>
 *
 * @author Gaby
 * @since 2019-08-29
 */
@TableName("bill_coin_task_info")
public class BillCoinTaskInfo implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 任务名称
     */
    private String name;
    /**
     * 任务图片
     */
    private String pic;
    /**
     * 任务描述
     */
    private String description;
    /**
     * 任务完成数量
     */
    @TableField("complete_num")
    private Integer completeNum;
    /**
     * 奖励数量
     */
    @TableField("reward_num")
    private Integer rewardNum;
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
     * 排序
     */
    private Integer sort;
    /**
     * 状态
     */
    private String status;

    public Long getId() {
        return id;
    }

    public BillCoinTaskInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public BillCoinTaskInfo setName(String name) {
        if (name != null)
            name = name.trim();
        this.name = name;
        return this;
    }

    public String getPic() {
        return pic;
    }

    public BillCoinTaskInfo setPic(String pic) {
        if (pic != null)
            pic = pic.trim();
        this.pic = pic;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public BillCoinTaskInfo setDescription(String description) {
        if (description != null)
            description = description.trim();
        this.description = description;
        return this;
    }

    public Integer getCompleteNum() {
        return completeNum;
    }

    public BillCoinTaskInfo setCompleteNum(Integer completeNum) {
        this.completeNum = completeNum;
        return this;
    }

    public Integer getRewardNum() {
        return rewardNum;
    }

    public BillCoinTaskInfo setRewardNum(Integer rewardNum) {
        this.rewardNum = rewardNum;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public BillCoinTaskInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public BillCoinTaskInfo setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    public Integer getSort() {
        return sort;
    }

    public BillCoinTaskInfo setSort(Integer sort) {
        this.sort = sort;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public BillCoinTaskInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "bill_coin_task_info";
    public static final String ID = "id";

    /**
     * 任务名称
     */
    public static final String NAME = "name";

    /**
     * 任务图片
     */
    public static final String PIC = "pic";

    /**
     * 任务描述
     */
    public static final String DESCRIPTION = "description";

    /**
     * 任务完成数量
     */
    public static final String COMPLETE_NUM = "complete_num";

    /**
     * 奖励数量
     */
    public static final String REWARD_NUM = "reward_num";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 修改时间
     */
    public static final String MODIFY_TIME = "modify_time";

    /**
     * 排序
     */
    public static final String SORT = "sort";

    /**
     * 状态
     */
    public static final String STATUS = "status";

    @Override
    public BillCoinTaskInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

