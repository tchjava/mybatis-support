package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionOrderInfo;

/**
 * <p>
 * 拍卖-订单表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-07-10
 */
public interface AuctionOrderInfoService extends IService<AuctionOrderInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionOrderInfo getOnly(EntityWrapper<AuctionOrderInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
