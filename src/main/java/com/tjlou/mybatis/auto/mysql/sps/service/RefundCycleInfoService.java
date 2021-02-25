package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.RefundCycleInfo;

/**
 * <p>
 * 退款周期表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2019-07-16
 */
public interface RefundCycleInfoService extends IService<RefundCycleInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default RefundCycleInfo getOnly(EntityWrapper<RefundCycleInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
