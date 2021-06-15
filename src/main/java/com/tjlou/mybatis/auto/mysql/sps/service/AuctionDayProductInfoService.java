package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionDayProductInfo;

/**
 * <p>
 * 天天竞拍产品表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2021-01-13
 */
public interface AuctionDayProductInfoService extends IService<AuctionDayProductInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionDayProductInfo getOnly(Wrapper<AuctionDayProductInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
