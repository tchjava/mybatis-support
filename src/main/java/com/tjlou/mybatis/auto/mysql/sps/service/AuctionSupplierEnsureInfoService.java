package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionSupplierEnsureInfo;

/**
 * <p>
 * 商家保障条件配置表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-10-15
 */
public interface AuctionSupplierEnsureInfoService extends IService<AuctionSupplierEnsureInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionSupplierEnsureInfo getOnly(EntityWrapper<AuctionSupplierEnsureInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
