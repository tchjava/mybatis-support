package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.PayModeInfo;

/**
 * <p>
 * 支付方式信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2019-10-25
 */
public interface PayModeInfoService extends IService<PayModeInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default PayModeInfo getOnly(EntityWrapper<PayModeInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
