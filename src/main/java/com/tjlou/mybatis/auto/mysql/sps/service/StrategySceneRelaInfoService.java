package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.StrategySceneRelaInfo;

/**
 * <p>
 * 学堂场景关联信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-07-17
 */
public interface StrategySceneRelaInfoService extends IService<StrategySceneRelaInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default StrategySceneRelaInfo getOnly(EntityWrapper<StrategySceneRelaInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
