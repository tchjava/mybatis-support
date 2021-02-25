package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionOrderItemInfo;

/**
 * <p>
 * 拍卖-订单条目表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-06-22
 */
public interface AuctionOrderItemInfoService extends IService<AuctionOrderItemInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionOrderItemInfo getOnly(EntityWrapper<AuctionOrderItemInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
