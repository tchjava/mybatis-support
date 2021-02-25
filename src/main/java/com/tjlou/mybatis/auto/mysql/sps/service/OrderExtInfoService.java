package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.OrderExtInfo;

/**
 * <p>
 * 订单拓展表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-08-01
 */
public interface OrderExtInfoService extends IService<OrderExtInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default OrderExtInfo getOnly(EntityWrapper<OrderExtInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
