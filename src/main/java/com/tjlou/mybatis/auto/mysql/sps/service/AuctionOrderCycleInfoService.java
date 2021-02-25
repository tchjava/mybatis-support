package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionOrderCycleInfo;

/**
 * <p>
 * 拍卖-订单周期表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-06-29
 */
public interface AuctionOrderCycleInfoService extends IService<AuctionOrderCycleInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionOrderCycleInfo getOnly(EntityWrapper<AuctionOrderCycleInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
