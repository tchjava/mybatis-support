package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionBalanceInfo;

/**
 * <p>
 * 拍卖余额信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-05-29
 */
public interface AuctionBalanceInfoService extends IService<AuctionBalanceInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionBalanceInfo getOnly(EntityWrapper<AuctionBalanceInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
