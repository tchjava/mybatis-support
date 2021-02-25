package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionDayProductResourcesInfo;

/**
 * <p>
 * 天天竞拍资源表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2021-01-12
 */
public interface AuctionDayProductResourcesInfoService extends IService<AuctionDayProductResourcesInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionDayProductResourcesInfo getOnly(EntityWrapper<AuctionDayProductResourcesInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
