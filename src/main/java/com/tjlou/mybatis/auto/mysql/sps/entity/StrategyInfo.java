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
 * 攻略信息表
 * </p>
 *
 * @author Gaby
 * @since 2020-09-04
 */
@TableName("strategy_info")
public class StrategyInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
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
     * 主图
     */
    @TableField("first_pic")
    private String firstPic;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 是否置顶
     */
    private Integer hot;
    /**
     * 攻略分类
     */
    @TableField("strategy_category_id")
    private Long strategyCategoryId;
    /**
     * 跳转类型  1-跳转内容  2-跳转H5
     */
    @TableField("redirect_type")
    private Integer redirectType;
    /**
     * 状态 00A-有效 00Z-失效
     */
    private String status;
    /**
     * H5页面地址
     */
    @TableField("h5_url")
    private String h5Url;
    /**
     * 动作名字
     */
    @TableField("action_name")
    private String actionName;
    /**
     * 系统类型 1-超级仓库 2-拍卖
     */
    @TableField("system_type")
    private Integer systemType;
    /**
     * 是否隐藏
     */
    private Integer hide;


    public Long getId() {
        return id;
    }

    public StrategyInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public StrategyInfo setTitle(String title) {
        if (title != null)
            title = title.trim();
        this.title = title;
        return this;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public StrategyInfo setSubTitle(String subTitle) {
        if (subTitle != null)
            subTitle = subTitle.trim();
        this.subTitle = subTitle;
        return this;
    }

    public String getFirstPic() {
        return firstPic;
    }

    public StrategyInfo setFirstPic(String firstPic) {
        if (firstPic != null)
            firstPic = firstPic.trim();
        this.firstPic = firstPic;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public StrategyInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Integer getHot() {
        return hot;
    }

    public StrategyInfo setHot(Integer hot) {
        this.hot = hot;
        return this;
    }

    public Long getStrategyCategoryId() {
        return strategyCategoryId;
    }

    public StrategyInfo setStrategyCategoryId(Long strategyCategoryId) {
        this.strategyCategoryId = strategyCategoryId;
        return this;
    }

    public Integer getRedirectType() {
        return redirectType;
    }

    public StrategyInfo setRedirectType(Integer redirectType) {
        this.redirectType = redirectType;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public StrategyInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    public String getH5Url() {
        return h5Url;
    }

    public StrategyInfo setH5Url(String h5Url) {
        if (h5Url != null)
            h5Url = h5Url.trim();
        this.h5Url = h5Url;
        return this;
    }

    public String getActionName() {
        return actionName;
    }

    public StrategyInfo setActionName(String actionName) {
        if (actionName != null)
            actionName = actionName.trim();
        this.actionName = actionName;
        return this;
    }

    public Integer getSystemType() {
        return systemType;
    }

    public StrategyInfo setSystemType(Integer systemType) {
        this.systemType = systemType;
        return this;
    }

    public Integer getHide() {
        return hide;
    }

    public StrategyInfo setHide(Integer hide) {
        this.hide = hide;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "strategy_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 标题
     */
    public static final String TITLE = "title";

    /**
     * 子标题
     */
    public static final String SUB_TITLE = "sub_title";

    /**
     * 主图
     */
    public static final String FIRST_PIC = "first_pic";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 是否置顶
     */
    public static final String HOT = "hot";

    /**
     * 攻略分类
     */
    public static final String STRATEGY_CATEGORY_ID = "strategy_category_id";

    /**
     * 跳转类型  1-跳转内容  2-跳转H5
     */
    public static final String REDIRECT_TYPE = "redirect_type";

    /**
     * 状态 00A-有效 00Z-失效
     */
    public static final String STATUS = "status";

    /**
     * H5页面地址
     */
    public static final String H5_URL = "h5_url";

    /**
     * 动作名字
     */
    public static final String ACTION_NAME = "action_name";

    /**
     * 系统类型 1-超级仓库 2-拍卖
     */
    public static final String SYSTEM_TYPE = "system_type";

    /**
     * 是否隐藏
     */
    public static final String HIDE = "hide";


    @Override
    public StrategyInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

