package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.StrategyInfo;

/**
 * <p>
 * 攻略信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-09-04
 */
public interface StrategyInfoService extends IService<StrategyInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default StrategyInfo getOnly(EntityWrapper<StrategyInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
