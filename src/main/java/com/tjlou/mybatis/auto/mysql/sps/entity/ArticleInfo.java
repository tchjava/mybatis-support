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
 * 文章信息表
 * </p>
 *
 * @author Gaby
 * @since 2020-02-24
 */
@TableName("article_info")
public class ArticleInfo implements Serializable, IEntity {


    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 所属用户
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 文章标题
     */
    private String title;
    /**
     * 文章内容
     */
    private String content;
    /**
     * 文章封面
     */
    private String cover;
    /**
     * 文章描述
     */
    private String description;
    /**
     * 状态 00A-有效  00Z-失效
     */
    private String status;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 转发数
     */
    @TableField("relay_num")
    private Integer relayNum;


    public Long getId() {
        return id;
    }

    public ArticleInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public ArticleInfo setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public ArticleInfo setTitle(String title) {
        if (title != null)
            title = title.trim();
        this.title = title;
        return this;
    }

    public String getContent() {
        return content;
    }

    public ArticleInfo setContent(String content) {
        if (content != null)
            content = content.trim();
        this.content = content;
        return this;
    }

    public String getCover() {
        return cover;
    }

    public ArticleInfo setCover(String cover) {
        if (cover != null)
            cover = cover.trim();
        this.cover = cover;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ArticleInfo setDescription(String description) {
        if (description != null)
            description = description.trim();
        this.description = description;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public ArticleInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public ArticleInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Integer getRelayNum() {
        return relayNum;
    }

    public ArticleInfo setRelayNum(Integer relayNum) {
        this.relayNum = relayNum;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "article_info";
    public static final String ID = "id";

    /**
     * 所属用户
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 文章标题
     */
    public static final String TITLE = "title";

    /**
     * 文章内容
     */
    public static final String CONTENT = "content";

    /**
     * 文章封面
     */
    public static final String COVER = "cover";

    /**
     * 文章描述
     */
    public static final String DESCRIPTION = "description";

    /**
     * 状态 00A-有效  00Z-失效
     */
    public static final String STATUS = "status";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 转发数
     */
    public static final String RELAY_NUM = "relay_num";


    @Override
    public ArticleInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

