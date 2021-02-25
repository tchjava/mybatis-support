package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.RefundReasonInfo;

/**
 * <p>
 * 退款原因信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-03-24
 */
public interface RefundReasonInfoService extends IService<RefundReasonInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default RefundReasonInfo getOnly(EntityWrapper<RefundReasonInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
