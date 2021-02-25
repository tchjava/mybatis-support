package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.GoodsAttributeInstance;

/**
 * <p>
 * 商品属性实例表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2019-06-20
 */
public interface GoodsAttributeInstanceService extends IService<GoodsAttributeInstance> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default GoodsAttributeInstance getOnly(EntityWrapper<GoodsAttributeInstance> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
