package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.PayModuleRuleInfo;

/**
 * <p>
 * 支付模块规则说明 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-09-12
 */
public interface PayModuleRuleInfoService extends IService<PayModuleRuleInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default PayModuleRuleInfo getOnly(EntityWrapper<PayModuleRuleInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
