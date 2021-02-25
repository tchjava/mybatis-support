package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionInterceptionTimeInfo;

/**
 * <p>
 * 截拍时间信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-05-21
 */
public interface AuctionInterceptionTimeInfoService extends IService<AuctionInterceptionTimeInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionInterceptionTimeInfo getOnly(EntityWrapper<AuctionInterceptionTimeInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
