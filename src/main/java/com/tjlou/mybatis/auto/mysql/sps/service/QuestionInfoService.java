package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.QuestionInfo;

/**
 * <p>
 * 常见问题信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2019-08-14
 */
public interface QuestionInfoService extends IService<QuestionInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default QuestionInfo getOnly(EntityWrapper<QuestionInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
