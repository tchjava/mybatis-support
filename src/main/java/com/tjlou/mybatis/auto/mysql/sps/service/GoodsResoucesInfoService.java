package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.GoodsResoucesInfo;

/**
 * <p>
 * 商品资源表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2019-09-11
 */
public interface GoodsResoucesInfoService extends IService<GoodsResoucesInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default GoodsResoucesInfo getOnly(EntityWrapper<GoodsResoucesInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
