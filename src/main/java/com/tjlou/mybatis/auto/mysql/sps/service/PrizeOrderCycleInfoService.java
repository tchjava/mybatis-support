package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.PrizeOrderCycleInfo;

/**
 * <p>
 * 奖品订单周期表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2019-09-06
 */
public interface PrizeOrderCycleInfoService extends IService<PrizeOrderCycleInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default PrizeOrderCycleInfo getOnly(EntityWrapper<PrizeOrderCycleInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
