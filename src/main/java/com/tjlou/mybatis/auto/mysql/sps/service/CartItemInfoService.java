package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.CartItemInfo;

/**
 * <p>
 * 购物车明细表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2019-11-27
 */
public interface CartItemInfoService extends IService<CartItemInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default CartItemInfo getOnly(EntityWrapper<CartItemInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
