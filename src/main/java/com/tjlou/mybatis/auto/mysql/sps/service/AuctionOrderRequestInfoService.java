package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionOrderRequestInfo;

/**
 * <p>
 * 拍卖-订单申请延迟表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-06-22
 */
public interface AuctionOrderRequestInfoService extends IService<AuctionOrderRequestInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionOrderRequestInfo getOnly(EntityWrapper<AuctionOrderRequestInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
