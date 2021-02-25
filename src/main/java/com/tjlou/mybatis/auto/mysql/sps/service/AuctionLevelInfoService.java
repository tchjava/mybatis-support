package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionLevelInfo;

/**
 * <p>
 * 拍卖-买卖家等级表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-06-18
 */
public interface AuctionLevelInfoService extends IService<AuctionLevelInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionLevelInfo getOnly(EntityWrapper<AuctionLevelInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
