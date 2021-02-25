package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionOfficialExtInfo;

/**
 * <p>
 * 拍卖公告拓展表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-09-03
 */
public interface AuctionOfficialExtInfoService extends IService<AuctionOfficialExtInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionOfficialExtInfo getOnly(EntityWrapper<AuctionOfficialExtInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
