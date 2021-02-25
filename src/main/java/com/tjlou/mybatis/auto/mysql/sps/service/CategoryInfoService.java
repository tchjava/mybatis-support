package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.CategoryInfo;

/**
 * <p>
 * 分类信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-11-04
 */
public interface CategoryInfoService extends IService<CategoryInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default CategoryInfo getOnly(EntityWrapper<CategoryInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
