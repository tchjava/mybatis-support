package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionDayInstanceInfo;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 天天竞拍拍品实例表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2021-06-15
 */
public interface AuctionDayInstanceInfoService extends IService<AuctionDayInstanceInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionDayInstanceInfo getOnly(Wrapper<AuctionDayInstanceInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
