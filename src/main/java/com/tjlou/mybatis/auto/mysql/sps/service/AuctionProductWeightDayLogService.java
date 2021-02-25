package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionProductWeightDayLog;

/**
 * <p>
 * 拍卖-拍品单日权重日志表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-11-06
 */
public interface AuctionProductWeightDayLogService extends IService<AuctionProductWeightDayLog> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionProductWeightDayLog getOnly(EntityWrapper<AuctionProductWeightDayLog> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
