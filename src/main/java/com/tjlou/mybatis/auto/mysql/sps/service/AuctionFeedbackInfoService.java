package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionFeedbackInfo;

/**
 * <p>
 * 锤定意见反馈表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-09-04
 */
public interface AuctionFeedbackInfoService extends IService<AuctionFeedbackInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionFeedbackInfo getOnly(EntityWrapper<AuctionFeedbackInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
