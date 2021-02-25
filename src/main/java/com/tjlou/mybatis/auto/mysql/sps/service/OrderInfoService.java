package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.OrderInfo;

/**
 * <p>
 * 订单信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-04-30
 */
public interface OrderInfoService extends IService<OrderInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default OrderInfo getOnly(EntityWrapper<OrderInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
