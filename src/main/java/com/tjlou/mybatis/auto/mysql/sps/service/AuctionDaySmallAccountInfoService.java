package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionDaySmallAccountInfo;

/**
 * <p>
 * 天天竞拍小号信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2021-06-04
 */
public interface AuctionDaySmallAccountInfoService extends IService<AuctionDaySmallAccountInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionDaySmallAccountInfo getOnly(Wrapper<AuctionDaySmallAccountInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
