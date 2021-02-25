package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.GoodsAttributeInfo;

/**
 * <p>
 * 商品属性信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2019-08-10
 */
public interface GoodsAttributeInfoService extends IService<GoodsAttributeInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default GoodsAttributeInfo getOnly(EntityWrapper<GoodsAttributeInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
