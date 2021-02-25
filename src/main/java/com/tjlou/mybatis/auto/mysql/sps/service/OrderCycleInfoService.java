package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.OrderCycleInfo;

/**
 * <p>
 * 订单周期表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2019-07-01
 */
public interface OrderCycleInfoService extends IService<OrderCycleInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default OrderCycleInfo getOnly(EntityWrapper<OrderCycleInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
