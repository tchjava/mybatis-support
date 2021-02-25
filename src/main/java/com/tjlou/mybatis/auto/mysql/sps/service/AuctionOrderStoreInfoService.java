package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionOrderStoreInfo;

/**
 * <p>
 * 拍卖订单仓库关联表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-07-20
 */
public interface AuctionOrderStoreInfoService extends IService<AuctionOrderStoreInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionOrderStoreInfo getOnly(EntityWrapper<AuctionOrderStoreInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
