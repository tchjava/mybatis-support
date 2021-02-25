package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionCoinLog;

/**
 * <p>
 * 拍卖-金币明细表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-09-14
 */
public interface AuctionCoinLogService extends IService<AuctionCoinLog> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionCoinLog getOnly(EntityWrapper<AuctionCoinLog> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
