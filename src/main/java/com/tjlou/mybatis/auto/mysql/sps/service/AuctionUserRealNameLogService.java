package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionUserRealNameLog;

/**
 * <p>
 * 拍卖-用户实名认证记录表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-11-07
 */
public interface AuctionUserRealNameLogService extends IService<AuctionUserRealNameLog> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionUserRealNameLog getOnly(EntityWrapper<AuctionUserRealNameLog> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
