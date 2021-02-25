package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionAppVersionInfo;

/**
 * <p>
 * 拍卖-app版本更新日志表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-07-03
 */
public interface AuctionAppVersionInfoService extends IService<AuctionAppVersionInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionAppVersionInfo getOnly(EntityWrapper<AuctionAppVersionInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
