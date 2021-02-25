package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.GoodsInfo;

/**
 * <p>
 * 商品信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-04-29
 */
public interface GoodsInfoService extends IService<GoodsInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default GoodsInfo getOnly(EntityWrapper<GoodsInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
