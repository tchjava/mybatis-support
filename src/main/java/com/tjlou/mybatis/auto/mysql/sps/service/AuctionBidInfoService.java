package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionBidInfo;

/**
 * <p>
 * 出价信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-06-05
 */
public interface AuctionBidInfoService extends IService<AuctionBidInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionBidInfo getOnly(EntityWrapper<AuctionBidInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
