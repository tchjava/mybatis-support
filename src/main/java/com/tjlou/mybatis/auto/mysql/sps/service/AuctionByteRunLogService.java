package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionByteRunLog;

/**
 * <p>
 * 拍卖-字节跳动推送广告记录表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-09-25
 */
public interface AuctionByteRunLogService extends IService<AuctionByteRunLog> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionByteRunLog getOnly(EntityWrapper<AuctionByteRunLog> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
