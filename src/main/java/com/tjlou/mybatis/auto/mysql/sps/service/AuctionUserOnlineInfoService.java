package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionUserOnlineInfo;

/**
 * <p>
 * 用户在线表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-12-01
 */
public interface AuctionUserOnlineInfoService extends IService<AuctionUserOnlineInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionUserOnlineInfo getOnly(EntityWrapper<AuctionUserOnlineInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
