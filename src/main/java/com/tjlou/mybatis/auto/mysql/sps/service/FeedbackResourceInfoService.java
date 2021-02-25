package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.FeedbackResourceInfo;

/**
 * <p>
 * 意见反馈资源表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2019-06-23
 */
public interface FeedbackResourceInfoService extends IService<FeedbackResourceInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default FeedbackResourceInfo getOnly(EntityWrapper<FeedbackResourceInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
