package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionWeightShopRatioInfo;

/**
 * <p>
 * 拍卖-店铺权重系数表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-12-23
 */
public interface AuctionWeightShopRatioInfoService extends IService<AuctionWeightShopRatioInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionWeightShopRatioInfo getOnly(EntityWrapper<AuctionWeightShopRatioInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
