package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionAdvertPlaceInfo;

/**
 * <p>
 * 拍卖-广告位信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2021-07-12
 */
public interface AuctionAdvertPlaceInfoService extends IService<AuctionAdvertPlaceInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionAdvertPlaceInfo getOnly(Wrapper<AuctionAdvertPlaceInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
