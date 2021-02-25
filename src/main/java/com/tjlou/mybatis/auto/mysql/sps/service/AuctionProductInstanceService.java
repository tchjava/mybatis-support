package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionProductInstance;

/**
 * <p>
 * 拍品实例表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-12-17
 */
public interface AuctionProductInstanceService extends IService<AuctionProductInstance> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionProductInstance getOnly(EntityWrapper<AuctionProductInstance> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
