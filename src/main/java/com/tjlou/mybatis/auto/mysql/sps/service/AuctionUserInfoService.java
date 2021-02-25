package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionUserInfo;

/**
 * <p>
 * 拍卖用户表(原拓展表) 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-12-23
 */
public interface AuctionUserInfoService extends IService<AuctionUserInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionUserInfo getOnly(EntityWrapper<AuctionUserInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
