package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.GoodsActivityInfo;

/**
 * <p>
 * 商品活动信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2019-08-23
 */
public interface GoodsActivityInfoService extends IService<GoodsActivityInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default GoodsActivityInfo getOnly(EntityWrapper<GoodsActivityInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
