package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionClickAdvertLog;

/**
 * <p>
 * 拍卖-点击广告日志 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-11-03
 */
public interface AuctionClickAdvertLogService extends IService<AuctionClickAdvertLog> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionClickAdvertLog getOnly(EntityWrapper<AuctionClickAdvertLog> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
