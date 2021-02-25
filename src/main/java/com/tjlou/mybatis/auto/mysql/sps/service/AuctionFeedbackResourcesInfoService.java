package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionFeedbackResourcesInfo;

/**
 * <p>
 * 锤定意见反馈资源表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-09-04
 */
public interface AuctionFeedbackResourcesInfoService extends IService<AuctionFeedbackResourcesInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionFeedbackResourcesInfo getOnly(EntityWrapper<AuctionFeedbackResourcesInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
