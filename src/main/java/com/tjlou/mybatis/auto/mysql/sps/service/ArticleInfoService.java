package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.ArticleInfo;

/**
 * <p>
 * 文章信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-02-24
 */
public interface ArticleInfoService extends IService<ArticleInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default ArticleInfo getOnly(EntityWrapper<ArticleInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
