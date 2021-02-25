package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionBrandSiteConditionInfo;

/**
 * <p>
 * 品牌馆开通条件配置表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-10-20
 */
public interface AuctionBrandSiteConditionInfoService extends IService<AuctionBrandSiteConditionInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionBrandSiteConditionInfo getOnly(EntityWrapper<AuctionBrandSiteConditionInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
