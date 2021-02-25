package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionShopWeightDayLog;

/**
 * <p>
 * 拍卖-店铺单日权重日志表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-11-05
 */
public interface AuctionShopWeightDayLogService extends IService<AuctionShopWeightDayLog> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionShopWeightDayLog getOnly(EntityWrapper<AuctionShopWeightDayLog> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
