package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.ScoreRuleInfo;

/**
 * <p>
 * 积分规则表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2019-08-05
 */
public interface ScoreRuleInfoService extends IService<ScoreRuleInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default ScoreRuleInfo getOnly(EntityWrapper<ScoreRuleInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
