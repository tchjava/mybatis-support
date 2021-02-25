package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.SupplierLimitLog;

/**
 * <p>
 * 商家受限日志表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2019-12-20
 */
public interface SupplierLimitLogService extends IService<SupplierLimitLog> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default SupplierLimitLog getOnly(EntityWrapper<SupplierLimitLog> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
