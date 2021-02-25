package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.ProductInstanceExtInfo;

/**
 * <p>
 * 拍品实例拓展信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-08-20
 */
public interface ProductInstanceExtInfoService extends IService<ProductInstanceExtInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default ProductInstanceExtInfo getOnly(EntityWrapper<ProductInstanceExtInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
