package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionBrandSiteConditionWhiteInfo;

/**
 * <p>
 * 品牌馆条件白名单信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-10-21
 */
public interface AuctionBrandSiteConditionWhiteInfoService extends IService<AuctionBrandSiteConditionWhiteInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionBrandSiteConditionWhiteInfo getOnly(EntityWrapper<AuctionBrandSiteConditionWhiteInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
