package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionDayChanceLog;

/**
 * <p>
 * 天天竞拍出价机会记录表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2021-01-14
 */
public interface AuctionDayChanceLogService extends IService<AuctionDayChanceLog> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionDayChanceLog getOnly(EntityWrapper<AuctionDayChanceLog> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
