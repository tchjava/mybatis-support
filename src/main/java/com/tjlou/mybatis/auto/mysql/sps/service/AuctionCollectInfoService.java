package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionCollectInfo;

/**
 * <p>
 * 拍品收藏信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-06-05
 */
public interface AuctionCollectInfoService extends IService<AuctionCollectInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionCollectInfo getOnly(EntityWrapper<AuctionCollectInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
