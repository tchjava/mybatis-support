package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionUserDimensionInfo;

/**
 * <p>
 * 拍卖用户维度表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-08-12
 */
public interface AuctionUserDimensionInfoService extends IService<AuctionUserDimensionInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionUserDimensionInfo getOnly(EntityWrapper<AuctionUserDimensionInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
