package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.ContentCategoryInfo;

/**
 * <p>
 * 广告分类表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2019-08-22
 */
public interface ContentCategoryInfoService extends IService<ContentCategoryInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default ContentCategoryInfo getOnly(EntityWrapper<ContentCategoryInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
