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
 * 广告信息表
 * </p>
 *
 * @author Gaby
 * @since 2019-08-21
 */
@TableName("content_info")
public class ContentInfo implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 内容分类标识
     */
    @TableField("category_id")
    private Long categoryId;
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
     * 链接
     */
    private String url;
    /**
     * 图片
     */
    private String pic;
    /**
     * 状态 00A-有效 00Z-失效
     */
    private String status;
    /**
     * 排序
     */
    private Integer sort;
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

    public Long getId() {
        return id;
    }

    public ContentInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public ContentInfo setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public ContentInfo setTitle(String title) {
        if (title != null)
            title = title.trim();
        this.title = title;
        return this;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public ContentInfo setSubTitle(String subTitle) {
        if (subTitle != null)
            subTitle = subTitle.trim();
        this.subTitle = subTitle;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public ContentInfo setUrl(String url) {
        if (url != null)
            url = url.trim();
        this.url = url;
        return this;
    }

    public String getPic() {
        return pic;
    }

    public ContentInfo setPic(String pic) {
        if (pic != null)
            pic = pic.trim();
        this.pic = pic;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public ContentInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    public Integer getSort() {
        return sort;
    }

    public ContentInfo setSort(Integer sort) {
        this.sort = sort;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public ContentInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public ContentInfo setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "content_info";
    public static final String ID = "id";

    /**
     * 内容分类标识
     */
    public static final String CATEGORY_ID = "category_id";

    /**
     * 标题
     */
    public static final String TITLE = "title";

    /**
     * 子标题
     */
    public static final String SUB_TITLE = "sub_title";

    /**
     * 链接
     */
    public static final String URL = "url";

    /**
     * 图片
     */
    public static final String PIC = "pic";

    /**
     * 状态 00A-有效 00Z-失效
     */
    public static final String STATUS = "status";

    /**
     * 排序
     */
    public static final String SORT = "sort";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 修改时间
     */
    public static final String MODIFY_TIME = "modify_time";

    @Override
    public ContentInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

