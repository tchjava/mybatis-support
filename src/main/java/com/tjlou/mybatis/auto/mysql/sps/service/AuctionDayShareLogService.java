package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionDayShareLog;

/**
 * <p>
 * 天天竞拍分享记录表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2021-01-19
 */
public interface AuctionDayShareLogService extends IService<AuctionDayShareLog> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionDayShareLog getOnly(EntityWrapper<AuctionDayShareLog> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
