package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionUserActionInfo;

/**
 * <p>
 * 拍卖用户记录表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-06-07
 */
public interface AuctionUserActionInfoService extends IService<AuctionUserActionInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionUserActionInfo getOnly(EntityWrapper<AuctionUserActionInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
