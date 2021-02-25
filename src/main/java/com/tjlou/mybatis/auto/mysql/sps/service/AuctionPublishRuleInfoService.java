package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionPublishRuleInfo;

/**
 * <p>
 * 发布规则信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-07-06
 */
public interface AuctionPublishRuleInfoService extends IService<AuctionPublishRuleInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionPublishRuleInfo getOnly(EntityWrapper<AuctionPublishRuleInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
