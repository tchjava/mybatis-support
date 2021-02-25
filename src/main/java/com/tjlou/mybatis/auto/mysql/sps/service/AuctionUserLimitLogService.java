package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionUserLimitLog;

/**
 * <p>
 * 拍卖用户限制日志表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-08-20
 */
public interface AuctionUserLimitLogService extends IService<AuctionUserLimitLog> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionUserLimitLog getOnly(EntityWrapper<AuctionUserLimitLog> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
