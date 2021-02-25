package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionAdvertInfo;

/**
 * <p>
 * 拍卖-广告信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-10-29
 */
public interface AuctionAdvertInfoService extends IService<AuctionAdvertInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionAdvertInfo getOnly(EntityWrapper<AuctionAdvertInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
