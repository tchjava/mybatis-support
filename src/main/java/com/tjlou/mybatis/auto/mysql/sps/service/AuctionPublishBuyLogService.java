package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionPublishBuyLog;

/**
 * <p>
 * 拍卖-发布数量购买记录 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-11-16
 */
public interface AuctionPublishBuyLogService extends IService<AuctionPublishBuyLog> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionPublishBuyLog getOnly(EntityWrapper<AuctionPublishBuyLog> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
