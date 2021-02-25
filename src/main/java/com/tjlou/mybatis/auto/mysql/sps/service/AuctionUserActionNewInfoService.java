package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionUserActionNewInfo;

/**
 * <p>
 * 拍卖-用户行为日志表(新) 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-11-05
 */
public interface AuctionUserActionNewInfoService extends IService<AuctionUserActionNewInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionUserActionNewInfo getOnly(EntityWrapper<AuctionUserActionNewInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
