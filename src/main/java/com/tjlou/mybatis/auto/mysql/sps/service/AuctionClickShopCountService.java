package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionClickShopCount;

/**
 * <p>
 * 拍卖-用户访问店铺次数 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-12-23
 */
public interface AuctionClickShopCountService extends IService<AuctionClickShopCount> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionClickShopCount getOnly(EntityWrapper<AuctionClickShopCount> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
