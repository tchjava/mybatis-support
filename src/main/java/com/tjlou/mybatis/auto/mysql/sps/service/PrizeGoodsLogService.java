package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.PrizeGoodsLog;

/**
 * <p>
 * 抽奖商品日志表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2019-09-12
 */
public interface PrizeGoodsLogService extends IService<PrizeGoodsLog> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default PrizeGoodsLog getOnly(EntityWrapper<PrizeGoodsLog> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
