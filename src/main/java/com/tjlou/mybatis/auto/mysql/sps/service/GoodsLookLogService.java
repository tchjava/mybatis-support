package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.GoodsLookLog;

/**
 * <p>
 * 商品查看记录表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2019-08-06
 */
public interface GoodsLookLogService extends IService<GoodsLookLog> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default GoodsLookLog getOnly(EntityWrapper<GoodsLookLog> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
