package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionProductWeightInfo;

/**
 * <p>
 * 拍卖-拍品权重表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-12-23
 */
public interface AuctionProductWeightInfoService extends IService<AuctionProductWeightInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionProductWeightInfo getOnly(EntityWrapper<AuctionProductWeightInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
