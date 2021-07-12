package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionContributeInfo;

/**
 * <p>
 * 贡献榜信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2021-07-12
 */
public interface AuctionContributeInfoService extends IService<AuctionContributeInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionContributeInfo getOnly(Wrapper<AuctionContributeInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
