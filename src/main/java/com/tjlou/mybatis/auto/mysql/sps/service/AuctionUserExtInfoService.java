package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionUserExtInfo;

/**
 * <p>
 * 拍卖-用户拓展表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-12-17
 */
public interface AuctionUserExtInfoService extends IService<AuctionUserExtInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionUserExtInfo getOnly(EntityWrapper<AuctionUserExtInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
