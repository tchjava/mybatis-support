package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionPayLogInfo;

/**
 * <p>
 * 拍卖-支付日志表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-12-14
 */
public interface AuctionPayLogInfoService extends IService<AuctionPayLogInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionPayLogInfo getOnly(EntityWrapper<AuctionPayLogInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
