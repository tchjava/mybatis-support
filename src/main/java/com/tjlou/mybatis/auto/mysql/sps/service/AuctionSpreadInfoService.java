package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionSpreadInfo;

/**
 * <p>
 * 拍卖-推广信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-08-11
 */
public interface AuctionSpreadInfoService extends IService<AuctionSpreadInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionSpreadInfo getOnly(EntityWrapper<AuctionSpreadInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
