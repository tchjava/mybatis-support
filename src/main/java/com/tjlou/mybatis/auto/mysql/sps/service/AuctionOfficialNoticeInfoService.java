package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionOfficialNoticeInfo;

/**
 * <p>
 * 拍卖-官方公告 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-09-10
 */
public interface AuctionOfficialNoticeInfoService extends IService<AuctionOfficialNoticeInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionOfficialNoticeInfo getOnly(EntityWrapper<AuctionOfficialNoticeInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
