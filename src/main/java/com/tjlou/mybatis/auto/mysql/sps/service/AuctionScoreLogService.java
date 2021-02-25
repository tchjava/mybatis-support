package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionScoreLog;

/**
 * <p>
 * 拍卖-积分日志表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-06-29
 */
public interface AuctionScoreLogService extends IService<AuctionScoreLog> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionScoreLog getOnly(EntityWrapper<AuctionScoreLog> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
