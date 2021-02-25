package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.ProductInstanceTopInfo;

/**
 * <p>
 * 拍品置顶信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-08-21
 */
public interface ProductInstanceTopInfoService extends IService<ProductInstanceTopInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default ProductInstanceTopInfo getOnly(EntityWrapper<ProductInstanceTopInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
