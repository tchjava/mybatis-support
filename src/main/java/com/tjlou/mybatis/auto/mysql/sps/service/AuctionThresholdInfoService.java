package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionThresholdInfo;

/**
 * <p>
 * 拍卖-阈值信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-06-23
 */
public interface AuctionThresholdInfoService extends IService<AuctionThresholdInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionThresholdInfo getOnly(EntityWrapper<AuctionThresholdInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
