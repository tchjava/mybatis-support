package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionScoreInfo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-06-29
 */
public interface AuctionScoreInfoService extends IService<AuctionScoreInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionScoreInfo getOnly(EntityWrapper<AuctionScoreInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
