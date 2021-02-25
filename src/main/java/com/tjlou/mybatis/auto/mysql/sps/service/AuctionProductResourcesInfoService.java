package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionProductResourcesInfo;

/**
 * <p>
 * 拍品资源表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-05-30
 */
public interface AuctionProductResourcesInfoService extends IService<AuctionProductResourcesInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionProductResourcesInfo getOnly(EntityWrapper<AuctionProductResourcesInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
