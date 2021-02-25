package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.SupplierWarrantInfo;

/**
 * <p>
 * 商家消保金信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-03-10
 */
public interface SupplierWarrantInfoService extends IService<SupplierWarrantInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default SupplierWarrantInfo getOnly(EntityWrapper<SupplierWarrantInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
