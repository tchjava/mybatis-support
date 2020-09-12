package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 支付模块规则说明
 * </p>
 *
 * @author Gaby
 * @since 2020-09-12
 */
@TableName("pay_module_rule_info")
public class PayModuleRuleInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 模块类型 1-修改店铺支付  2-百亿补贴额度恢复
     */
    @TableField("module_type")
    private Integer moduleType;
    /**
     * 模块说明
     */
    @TableField("module_body")
    private String moduleBody;
    /**
     * 支付金额(单位:分)
     */
    @TableField("pay_money")
    private Long payMoney;
    /**
     * 推荐人分配比例(计算/100)
     */
    @TableField("recommend_ratio")
    private BigDecimal recommendRatio;
    /**
     * 合伙人分配比例(计算/100)
     */
    @TableField("partner_ratio")
    private BigDecimal partnerRatio;
    /**
     * 推荐人固定分配佣金(单位:分)
     */
    @TableField("recommend_money")
    private Long recommendMoney;
    /**
     * 合伙人固定分配佣金(单位:分)
     */
    @TableField("partner_money")
    private Long partnerMoney;
    /**
     * 计算类型 1-固定金额 2-百分比
     */
    @TableField("compute_type")
    private Integer computeType;
    /**
     * 修改次数
     */
    private Integer num;


    public Long getId() {
        return id;
    }

    public PayModuleRuleInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Integer getModuleType() {
        return moduleType;
    }

    public PayModuleRuleInfo setModuleType(Integer moduleType) {
        this.moduleType = moduleType;
        return this;
    }

    public String getModuleBody() {
        return moduleBody;
    }

    public PayModuleRuleInfo setModuleBody(String moduleBody) {
        if (moduleBody != null)
            moduleBody = moduleBody.trim();
        this.moduleBody = moduleBody;
        return this;
    }

    public Long getPayMoney() {
        return payMoney;
    }

    public PayModuleRuleInfo setPayMoney(Long payMoney) {
        this.payMoney = payMoney;
        return this;
    }

    public BigDecimal getRecommendRatio() {
        return recommendRatio;
    }

    public PayModuleRuleInfo setRecommendRatio(BigDecimal recommendRatio) {
        this.recommendRatio = recommendRatio;
        return this;
    }

    public BigDecimal getPartnerRatio() {
        return partnerRatio;
    }

    public PayModuleRuleInfo setPartnerRatio(BigDecimal partnerRatio) {
        this.partnerRatio = partnerRatio;
        return this;
    }

    public Long getRecommendMoney() {
        return recommendMoney;
    }

    public PayModuleRuleInfo setRecommendMoney(Long recommendMoney) {
        this.recommendMoney = recommendMoney;
        return this;
    }

    public Long getPartnerMoney() {
        return partnerMoney;
    }

    public PayModuleRuleInfo setPartnerMoney(Long partnerMoney) {
        this.partnerMoney = partnerMoney;
        return this;
    }

    public Integer getComputeType() {
        return computeType;
    }

    public PayModuleRuleInfo setComputeType(Integer computeType) {
        this.computeType = computeType;
        return this;
    }

    public Integer getNum() {
        return num;
    }

    public PayModuleRuleInfo setNum(Integer num) {
        this.num = num;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "pay_module_rule_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 模块类型 1-修改店铺支付  2-百亿补贴额度恢复
     */
    public static final String MODULE_TYPE = "module_type";

    /**
     * 模块说明
     */
    public static final String MODULE_BODY = "module_body";

    /**
     * 支付金额(单位:分)
     */
    public static final String PAY_MONEY = "pay_money";

    /**
     * 推荐人分配比例(计算/100)
     */
    public static final String RECOMMEND_RATIO = "recommend_ratio";

    /**
     * 合伙人分配比例(计算/100)
     */
    public static final String PARTNER_RATIO = "partner_ratio";

    /**
     * 推荐人固定分配佣金(单位:分)
     */
    public static final String RECOMMEND_MONEY = "recommend_money";

    /**
     * 合伙人固定分配佣金(单位:分)
     */
    public static final String PARTNER_MONEY = "partner_money";

    /**
     * 计算类型 1-固定金额 2-百分比
     */
    public static final String COMPUTE_TYPE = "compute_type";

    /**
     * 修改次数
     */
    public static final String NUM = "num";


    @Override
    public PayModuleRuleInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

