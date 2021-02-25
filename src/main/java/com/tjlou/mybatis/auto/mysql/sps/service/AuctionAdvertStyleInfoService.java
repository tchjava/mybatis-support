package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionAdvertStyleInfo;

/**
 * <p>
 * 拍卖-广告样式表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-10-29
 */
public interface AuctionAdvertStyleInfoService extends IService<AuctionAdvertStyleInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionAdvertStyleInfo getOnly(EntityWrapper<AuctionAdvertStyleInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
