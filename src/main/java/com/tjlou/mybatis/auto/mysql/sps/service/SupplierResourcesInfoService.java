package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.SupplierResourcesInfo;

/**
 * <p>
 * 供货商资源信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2019-07-09
 */
public interface SupplierResourcesInfoService extends IService<SupplierResourcesInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default SupplierResourcesInfo getOnly(EntityWrapper<SupplierResourcesInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
