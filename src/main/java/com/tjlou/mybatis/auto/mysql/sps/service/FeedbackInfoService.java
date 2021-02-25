package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.FeedbackInfo;

/**
 * <p>
 * 意见反馈表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2019-06-23
 */
public interface FeedbackInfoService extends IService<FeedbackInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default FeedbackInfo getOnly(EntityWrapper<FeedbackInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
