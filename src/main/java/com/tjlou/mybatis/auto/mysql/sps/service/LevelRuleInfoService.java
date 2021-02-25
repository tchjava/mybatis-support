package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.LevelRuleInfo;

/**
 * <p>
 * 等级规则信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2019-08-05
 */
public interface LevelRuleInfoService extends IService<LevelRuleInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default LevelRuleInfo getOnly(EntityWrapper<LevelRuleInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
