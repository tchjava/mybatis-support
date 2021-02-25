package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionBalanceLog;

/**
 * <p>
 * 拍卖-余额日志表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-09-14
 */
public interface AuctionBalanceLogService extends IService<AuctionBalanceLog> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionBalanceLog getOnly(EntityWrapper<AuctionBalanceLog> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
