package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionClickAdvertChannelCount;

/**
 * <p>
 * 拍卖-点击广告频道统计 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-11-03
 */
public interface AuctionClickAdvertChannelCountService extends IService<AuctionClickAdvertChannelCount> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionClickAdvertChannelCount getOnly(EntityWrapper<AuctionClickAdvertChannelCount> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
