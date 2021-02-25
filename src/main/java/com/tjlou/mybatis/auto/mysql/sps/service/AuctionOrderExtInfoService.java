package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionOrderExtInfo;

/**
 * <p>
 * 拍卖订单拓展表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-08-11
 */
public interface AuctionOrderExtInfoService extends IService<AuctionOrderExtInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionOrderExtInfo getOnly(EntityWrapper<AuctionOrderExtInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
