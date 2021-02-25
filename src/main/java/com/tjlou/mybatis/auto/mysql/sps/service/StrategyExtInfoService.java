package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.StrategyExtInfo;

/**
 * <p>
 * 攻略拓展表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-04-20
 */
public interface StrategyExtInfoService extends IService<StrategyExtInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default StrategyExtInfo getOnly(EntityWrapper<StrategyExtInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
