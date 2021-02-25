package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionDayCountdownInfo;

/**
 * <p>
 * 天天竞拍倒计时配置表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2021-01-12
 */
public interface AuctionDayCountdownInfoService extends IService<AuctionDayCountdownInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionDayCountdownInfo getOnly(EntityWrapper<AuctionDayCountdownInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
