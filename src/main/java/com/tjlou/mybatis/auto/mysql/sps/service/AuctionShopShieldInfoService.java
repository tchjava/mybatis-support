package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionShopShieldInfo;

/**
 * <p>
 * 拍卖店铺屏蔽表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-08-11
 */
public interface AuctionShopShieldInfoService extends IService<AuctionShopShieldInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionShopShieldInfo getOnly(EntityWrapper<AuctionShopShieldInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
