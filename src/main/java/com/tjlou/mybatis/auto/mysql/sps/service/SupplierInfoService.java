package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.SupplierInfo;

/**
 * <p>
 * 供货商信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-04-02
 */
public interface SupplierInfoService extends IService<SupplierInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default SupplierInfo getOnly(EntityWrapper<SupplierInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
