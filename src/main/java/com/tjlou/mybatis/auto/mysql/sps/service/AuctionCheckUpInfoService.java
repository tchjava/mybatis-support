package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionCheckUpInfo;

/**
 * <p>
 * 鉴定订单信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-10-10
 */
public interface AuctionCheckUpInfoService extends IService<AuctionCheckUpInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionCheckUpInfo getOnly(EntityWrapper<AuctionCheckUpInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
