package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.ArticleUserInfo;

/**
 * <p>
 * 文案-用户表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-03-02
 */
public interface ArticleUserInfoService extends IService<ArticleUserInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default ArticleUserInfo getOnly(EntityWrapper<ArticleUserInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
