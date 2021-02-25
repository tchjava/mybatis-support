package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.RefundInfo;

/**
 * <p>
 * 退款信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-02-11
 */
public interface RefundInfoService extends IService<RefundInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default RefundInfo getOnly(EntityWrapper<RefundInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
