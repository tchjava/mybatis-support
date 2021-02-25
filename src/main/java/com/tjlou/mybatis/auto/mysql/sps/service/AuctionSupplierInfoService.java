package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionSupplierInfo;

/**
 * <p>
 * 拍卖商家信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-07-30
 */
public interface AuctionSupplierInfoService extends IService<AuctionSupplierInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionSupplierInfo getOnly(EntityWrapper<AuctionSupplierInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
