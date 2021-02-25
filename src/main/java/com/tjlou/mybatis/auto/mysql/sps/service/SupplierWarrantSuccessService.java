package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.SupplierWarrantSuccess;

/**
 * <p>
 * 消保金缴纳成功记录表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2019-12-09
 */
public interface SupplierWarrantSuccessService extends IService<SupplierWarrantSuccess> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default SupplierWarrantSuccess getOnly(EntityWrapper<SupplierWarrantSuccess> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
