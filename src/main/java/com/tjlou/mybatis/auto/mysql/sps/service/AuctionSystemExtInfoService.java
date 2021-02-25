package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionSystemExtInfo;

/**
 * <p>
 * 拍卖系统消息拓展表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-09-03
 */
public interface AuctionSystemExtInfoService extends IService<AuctionSystemExtInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionSystemExtInfo getOnly(EntityWrapper<AuctionSystemExtInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
