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
 * 拍卖-官方公告
 * </p>
 *
 * @author Gaby
 * @since 2020-09-10
 */
@TableName("auction_official_notice_info")
public class AuctionOfficialNoticeInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 公告编号
     */
    @TableField("official_code")
    private String officialCode;
    /**
     * 标题
     */
    private String title;
    /**
     * 子标题
     */
    @TableField("sub_title")
    private String subTitle;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 1-跳转富文本内容  2-跳转h5链接 4-拍品详情 8-订单详情
     */
    @TableField("skip_type")
    private Integer skipType;
    /**
     * 主图
     */
    @TableField("first_pic")
    private String firstPic;
    /**
     * 状态  00A-有效  00Z-失效
     */
    private String status;
    /**
     * 动作类型
     */
    @TableField("action_type")
    private Integer actionType;


    public Long getId() {
        return id;
    }

    public AuctionOfficialNoticeInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getOfficialCode() {
        return officialCode;
    }

    public AuctionOfficialNoticeInfo setOfficialCode(String officialCode) {
        if (officialCode != null)
            officialCode = officialCode.trim();
        this.officialCode = officialCode;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public AuctionOfficialNoticeInfo setTitle(String title) {
        if (title != null)
            title = title.trim();
        this.title = title;
        return this;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public AuctionOfficialNoticeInfo setSubTitle(String subTitle) {
        if (subTitle != null)
            subTitle = subTitle.trim();
        this.subTitle = subTitle;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public AuctionOfficialNoticeInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Integer getSkipType() {
        return skipType;
    }

    public AuctionOfficialNoticeInfo setSkipType(Integer skipType) {
        this.skipType = skipType;
        return this;
    }

    public String getFirstPic() {
        return firstPic;
    }

    public AuctionOfficialNoticeInfo setFirstPic(String firstPic) {
        if (firstPic != null)
            firstPic = firstPic.trim();
        this.firstPic = firstPic;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public AuctionOfficialNoticeInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    public Integer getActionType() {
        return actionType;
    }

    public AuctionOfficialNoticeInfo setActionType(Integer actionType) {
        this.actionType = actionType;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_official_notice_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 公告编号
     */
    public static final String OFFICIAL_CODE = "official_code";

    /**
     * 标题
     */
    public static final String TITLE = "title";

    /**
     * 子标题
     */
    public static final String SUB_TITLE = "sub_title";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 1-跳转富文本内容  2-跳转h5链接 4-拍品详情 8-订单详情
     */
    public static final String SKIP_TYPE = "skip_type";

    /**
     * 主图
     */
    public static final String FIRST_PIC = "first_pic";

    /**
     * 状态  00A-有效  00Z-失效
     */
    public static final String STATUS = "status";

    /**
     * 动作类型
     */
    public static final String ACTION_TYPE = "action_type";


    @Override
    public AuctionOfficialNoticeInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

