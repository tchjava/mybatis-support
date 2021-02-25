package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.GoodsAttributeRule;

/**
 * <p>
 * 属性规则表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2019-06-20
 */
public interface GoodsAttributeRuleService extends IService<GoodsAttributeRule> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default GoodsAttributeRule getOnly(EntityWrapper<GoodsAttributeRule> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
