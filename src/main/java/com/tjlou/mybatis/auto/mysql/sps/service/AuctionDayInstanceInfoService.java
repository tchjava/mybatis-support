package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionDayInstanceInfo;

/**
 * <p>
 * 天天竞拍拍品实例表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2021-01-15
 */
public interface AuctionDayInstanceInfoService extends IService<AuctionDayInstanceInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionDayInstanceInfo getOnly(EntityWrapper<AuctionDayInstanceInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
