package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionDayInstanceTaskTokenInfo;

/**
 * <p>
 * 天天竞拍实例任务token记录表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2021-01-14
 */
public interface AuctionDayInstanceTaskTokenInfoService extends IService<AuctionDayInstanceTaskTokenInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionDayInstanceTaskTokenInfo getOnly(EntityWrapper<AuctionDayInstanceTaskTokenInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
