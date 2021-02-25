package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionDrawInfo;

/**
 * <p>
 * 拍卖系统抽点表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-06-23
 */
public interface AuctionDrawInfoService extends IService<AuctionDrawInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionDrawInfo getOnly(EntityWrapper<AuctionDrawInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
