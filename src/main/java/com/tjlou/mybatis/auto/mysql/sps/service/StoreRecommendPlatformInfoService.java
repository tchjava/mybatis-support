package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.StoreRecommendPlatformInfo;

/**
 * <p>
 * 超级仓库推荐平台信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2021-02-26
 */
public interface StoreRecommendPlatformInfoService extends IService<StoreRecommendPlatformInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default StoreRecommendPlatformInfo getOnly(EntityWrapper<StoreRecommendPlatformInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
