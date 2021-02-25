package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionDayProductExtInfo;

/**
 * <p>
 * 天天竞拍拓展表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2021-01-12
 */
public interface AuctionDayProductExtInfoService extends IService<AuctionDayProductExtInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionDayProductExtInfo getOnly(EntityWrapper<AuctionDayProductExtInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
