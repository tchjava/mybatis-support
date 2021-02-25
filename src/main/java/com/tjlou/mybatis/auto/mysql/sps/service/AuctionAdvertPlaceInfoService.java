package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionAdvertPlaceInfo;

/**
 * <p>
 * 拍卖-广告位信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-11-04
 */
public interface AuctionAdvertPlaceInfoService extends IService<AuctionAdvertPlaceInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionAdvertPlaceInfo getOnly(EntityWrapper<AuctionAdvertPlaceInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
