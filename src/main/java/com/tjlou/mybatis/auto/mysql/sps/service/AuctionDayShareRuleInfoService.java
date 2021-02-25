package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionDayShareRuleInfo;

/**
 * <p>
 * 天天竞拍分享规则表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2021-01-19
 */
public interface AuctionDayShareRuleInfoService extends IService<AuctionDayShareRuleInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionDayShareRuleInfo getOnly(EntityWrapper<AuctionDayShareRuleInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
