package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionContributeLog;

/**
 * <p>
 * 贡献明细表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2021-07-12
 */
public interface AuctionContributeLogService extends IService<AuctionContributeLog> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionContributeLog getOnly(Wrapper<AuctionContributeLog> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
