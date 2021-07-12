package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionContributeValueLog;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Gaby
 * @since 2021-07-12
 */
public interface AuctionContributeValueLogService extends IService<AuctionContributeValueLog> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionContributeValueLog getOnly(Wrapper<AuctionContributeValueLog> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
