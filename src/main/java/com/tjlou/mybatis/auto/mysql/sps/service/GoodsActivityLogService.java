package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.GoodsActivityLog;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Gaby
 * @since 2019-08-27
 */
public interface GoodsActivityLogService extends IService<GoodsActivityLog> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default GoodsActivityLog getOnly(EntityWrapper<GoodsActivityLog> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
