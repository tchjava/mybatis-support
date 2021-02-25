package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionFansInfo;

/**
 * <p>
 * 拍卖粉丝信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-06-05
 */
public interface AuctionFansInfoService extends IService<AuctionFansInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionFansInfo getOnly(EntityWrapper<AuctionFansInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
