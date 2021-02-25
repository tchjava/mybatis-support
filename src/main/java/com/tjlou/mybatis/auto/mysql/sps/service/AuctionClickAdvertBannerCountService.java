package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionClickAdvertBannerCount;

/**
 * <p>
 * 拍卖-点击广告banner图统计 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-11-03
 */
public interface AuctionClickAdvertBannerCountService extends IService<AuctionClickAdvertBannerCount> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionClickAdvertBannerCount getOnly(EntityWrapper<AuctionClickAdvertBannerCount> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
