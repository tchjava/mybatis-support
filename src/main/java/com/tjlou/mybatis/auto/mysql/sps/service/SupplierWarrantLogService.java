package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.SupplierWarrantLog;

/**
 * <p>
 * 商家消保缴纳日志 服务类
 * </p>
 *
 * @author Gaby
 * @since 2019-09-18
 */
public interface SupplierWarrantLogService extends IService<SupplierWarrantLog> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default SupplierWarrantLog getOnly(EntityWrapper<SupplierWarrantLog> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
