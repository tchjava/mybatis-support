package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionDayBidInfo;

/**
 * <p>
 * 天天竞拍实例出价信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2021-01-15
 */
public interface AuctionDayBidInfoService extends IService<AuctionDayBidInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionDayBidInfo getOnly(EntityWrapper<AuctionDayBidInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
