package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.ProductInstanceResourcesInfo;

/**
 * <p>
 * 拍品实例资源表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-06-02
 */
public interface ProductInstanceResourcesInfoService extends IService<ProductInstanceResourcesInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default ProductInstanceResourcesInfo getOnly(EntityWrapper<ProductInstanceResourcesInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
