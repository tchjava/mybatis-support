package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.CartInfo;

/**
 * <p>
 * 购物车信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-04-29
 */
public interface CartInfoService extends IService<CartInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default CartInfo getOnly(EntityWrapper<CartInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
