package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionHomeFlagInfo;

/**
 * <p>
 * 拍卖-首页标签信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2021-01-07
 */
public interface AuctionHomeFlagInfoService extends IService<AuctionHomeFlagInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionHomeFlagInfo getOnly(EntityWrapper<AuctionHomeFlagInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
