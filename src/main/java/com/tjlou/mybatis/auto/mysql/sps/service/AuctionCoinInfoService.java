package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionCoinInfo;

/**
 * <p>
 * 拍卖金币信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-05-29
 */
public interface AuctionCoinInfoService extends IService<AuctionCoinInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionCoinInfo getOnly(EntityWrapper<AuctionCoinInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
