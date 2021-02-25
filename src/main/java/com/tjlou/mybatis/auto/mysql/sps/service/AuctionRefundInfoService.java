package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionRefundInfo;

/**
 * <p>
 * 拍卖-退款信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-06-27
 */
public interface AuctionRefundInfoService extends IService<AuctionRefundInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionRefundInfo getOnly(EntityWrapper<AuctionRefundInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
