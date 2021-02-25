package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.GoodsLowerShelfLog;

/**
 * <p>
 * 商品下架记录表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-03-27
 */
public interface GoodsLowerShelfLogService extends IService<GoodsLowerShelfLog> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default GoodsLowerShelfLog getOnly(EntityWrapper<GoodsLowerShelfLog> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
