package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionDayActivitiesLog;

/**
 * <p>
 * 拍卖-日活记录 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-12-05
 */
public interface AuctionDayActivitiesLogService extends IService<AuctionDayActivitiesLog> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionDayActivitiesLog getOnly(EntityWrapper<AuctionDayActivitiesLog> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
