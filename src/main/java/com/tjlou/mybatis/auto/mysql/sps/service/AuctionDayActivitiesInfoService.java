package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionDayActivitiesInfo;

/**
 * <p>
 * 拍卖日活统计信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-12-05
 */
public interface AuctionDayActivitiesInfoService extends IService<AuctionDayActivitiesInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionDayActivitiesInfo getOnly(EntityWrapper<AuctionDayActivitiesInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
