package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionSupplierResourcesInfo;

/**
 * <p>
 * 拍卖商家资源表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-06-05
 */
public interface AuctionSupplierResourcesInfoService extends IService<AuctionSupplierResourcesInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionSupplierResourcesInfo getOnly(EntityWrapper<AuctionSupplierResourcesInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
