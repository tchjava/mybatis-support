package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionDayCommonChanceInfo;

/**
 * <p>
 * 天天竞拍拍品公共机会信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2021-01-14
 */
public interface AuctionDayCommonChanceInfoService extends IService<AuctionDayCommonChanceInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionDayCommonChanceInfo getOnly(EntityWrapper<AuctionDayCommonChanceInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
