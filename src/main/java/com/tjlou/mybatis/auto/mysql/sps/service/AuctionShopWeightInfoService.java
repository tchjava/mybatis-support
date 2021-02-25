package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionShopWeightInfo;

/**
 * <p>
 * 拍卖-店铺权重信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-12-23
 */
public interface AuctionShopWeightInfoService extends IService<AuctionShopWeightInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionShopWeightInfo getOnly(EntityWrapper<AuctionShopWeightInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
