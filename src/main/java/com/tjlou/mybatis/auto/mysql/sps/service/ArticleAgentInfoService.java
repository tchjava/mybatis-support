package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.ArticleAgentInfo;

/**
 * <p>
 * 文章-推荐人信息表(绑定给上下级关系) 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-02-24
 */
public interface ArticleAgentInfoService extends IService<ArticleAgentInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default ArticleAgentInfo getOnly(EntityWrapper<ArticleAgentInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
