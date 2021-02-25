package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.SiteShopInfo;

/**
 * <p>
 * 站点店铺信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-04-23
 */
public interface SiteShopInfoService extends IService<SiteShopInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default SiteShopInfo getOnly(EntityWrapper<SiteShopInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
