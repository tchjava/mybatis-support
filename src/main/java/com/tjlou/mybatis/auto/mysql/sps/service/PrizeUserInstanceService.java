package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.PrizeUserInstance;

/**
 * <p>
 * 抽奖用户实例表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2019-09-05
 */
public interface PrizeUserInstanceService extends IService<PrizeUserInstance> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default PrizeUserInstance getOnly(EntityWrapper<PrizeUserInstance> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
