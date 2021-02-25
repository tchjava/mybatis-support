package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionOrderSubsidyInfo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-07-09
 */
public interface AuctionOrderSubsidyInfoService extends IService<AuctionOrderSubsidyInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionOrderSubsidyInfo getOnly(EntityWrapper<AuctionOrderSubsidyInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
