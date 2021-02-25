package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.OrderPayLog;

/**
 * <p>
 * 支付日志表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-04-15
 */
public interface OrderPayLogService extends IService<OrderPayLog> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default OrderPayLog getOnly(EntityWrapper<OrderPayLog> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
