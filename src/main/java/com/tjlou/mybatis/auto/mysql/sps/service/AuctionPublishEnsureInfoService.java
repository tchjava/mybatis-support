package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionPublishEnsureInfo;

/**
 * <p>
 * 拍卖-发布-保证金配置表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-10-24
 */
public interface AuctionPublishEnsureInfoService extends IService<AuctionPublishEnsureInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionPublishEnsureInfo getOnly(EntityWrapper<AuctionPublishEnsureInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
