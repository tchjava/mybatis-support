package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionBrandSiteRequestInfo;

/**
 * <p>
 * 品牌馆请求信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-10-22
 */
public interface AuctionBrandSiteRequestInfoService extends IService<AuctionBrandSiteRequestInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionBrandSiteRequestInfo getOnly(EntityWrapper<AuctionBrandSiteRequestInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
