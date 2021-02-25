package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.SupplierCheckLog;

/**
 * <p>
 * 商家审核日志表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-03-26
 */
public interface SupplierCheckLogService extends IService<SupplierCheckLog> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default SupplierCheckLog getOnly(EntityWrapper<SupplierCheckLog> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
