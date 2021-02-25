package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionBrandSiteInfo;

/**
 * <p>
 * 拍卖-品牌馆信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-10-22
 */
public interface AuctionBrandSiteInfoService extends IService<AuctionBrandSiteInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionBrandSiteInfo getOnly(EntityWrapper<AuctionBrandSiteInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
