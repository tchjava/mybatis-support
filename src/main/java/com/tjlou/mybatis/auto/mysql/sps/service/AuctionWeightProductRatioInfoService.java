package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionWeightProductRatioInfo;

/**
 * <p>
 * 拍卖-拍品权重系数表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-12-23
 */
public interface AuctionWeightProductRatioInfoService extends IService<AuctionWeightProductRatioInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionWeightProductRatioInfo getOnly(EntityWrapper<AuctionWeightProductRatioInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
