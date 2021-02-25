package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.GoodsWeightInfo;

/**
 * <p>
 * 商品权重信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-02-07
 */
public interface GoodsWeightInfoService extends IService<GoodsWeightInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default GoodsWeightInfo getOnly(EntityWrapper<GoodsWeightInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
