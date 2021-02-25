package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionDayInstanceUserLog;

/**
 * <p>
 * 天天竞拍记录表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2021-01-14
 */
public interface AuctionDayInstanceUserLogService extends IService<AuctionDayInstanceUserLog> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionDayInstanceUserLog getOnly(EntityWrapper<AuctionDayInstanceUserLog> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
