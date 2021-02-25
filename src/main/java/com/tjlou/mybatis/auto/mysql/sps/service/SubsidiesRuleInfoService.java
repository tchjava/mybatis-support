package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.SubsidiesRuleInfo;

/**
 * <p>
 * 补贴额度规则表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-07-05
 */
public interface SubsidiesRuleInfoService extends IService<SubsidiesRuleInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default SubsidiesRuleInfo getOnly(EntityWrapper<SubsidiesRuleInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
