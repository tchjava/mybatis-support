package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.OrderItemInfo;

/**
 * <p>
 * 订单条目表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-06-02
 */
public interface OrderItemInfoService extends IService<OrderItemInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default OrderItemInfo getOnly(EntityWrapper<OrderItemInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
