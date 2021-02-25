package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.CategoryAttributeRela;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Gaby
 * @since 2019-08-13
 */
public interface CategoryAttributeRelaService extends IService<CategoryAttributeRela> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default CategoryAttributeRela getOnly(EntityWrapper<CategoryAttributeRela> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
