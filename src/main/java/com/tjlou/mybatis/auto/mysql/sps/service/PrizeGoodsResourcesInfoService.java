package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.PrizeGoodsResourcesInfo;

/**
 * <p>
 * 抽奖商品资源表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2019-08-31
 */
public interface PrizeGoodsResourcesInfoService extends IService<PrizeGoodsResourcesInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default PrizeGoodsResourcesInfo getOnly(EntityWrapper<PrizeGoodsResourcesInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
