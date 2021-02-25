package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionSystemMessageInfo;

/**
 * <p>
 * 拍卖系统消息 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-09-10
 */
public interface AuctionSystemMessageInfoService extends IService<AuctionSystemMessageInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionSystemMessageInfo getOnly(EntityWrapper<AuctionSystemMessageInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
