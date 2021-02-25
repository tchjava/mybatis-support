package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionMishapInfo;

/**
 * <p>
 * 锤定意外事件记录表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-09-16
 */
public interface AuctionMishapInfoService extends IService<AuctionMishapInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionMishapInfo getOnly(EntityWrapper<AuctionMishapInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
