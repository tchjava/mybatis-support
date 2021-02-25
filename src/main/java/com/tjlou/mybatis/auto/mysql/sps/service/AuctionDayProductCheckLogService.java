package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionDayProductCheckLog;

/**
 * <p>
 * 天天竞拍拍品审核日志表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2021-01-18
 */
public interface AuctionDayProductCheckLogService extends IService<AuctionDayProductCheckLog> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionDayProductCheckLog getOnly(EntityWrapper<AuctionDayProductCheckLog> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
