package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.PrizeOrderInfo;

/**
 * <p>
 * 奖品订单表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2019-12-03
 */
public interface PrizeOrderInfoService extends IService<PrizeOrderInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default PrizeOrderInfo getOnly(EntityWrapper<PrizeOrderInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
