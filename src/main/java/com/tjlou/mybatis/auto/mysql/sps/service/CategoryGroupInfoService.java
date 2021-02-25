package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.CategoryGroupInfo;

/**
 * <p>
 * 分类分组表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-08-17
 */
public interface CategoryGroupInfoService extends IService<CategoryGroupInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default CategoryGroupInfo getOnly(EntityWrapper<CategoryGroupInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
