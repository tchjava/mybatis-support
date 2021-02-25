package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionDayInstanceCommentInfo;

/**
 * <p>
 * 天天竞拍评价表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2021-01-18
 */
public interface AuctionDayInstanceCommentInfoService extends IService<AuctionDayInstanceCommentInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionDayInstanceCommentInfo getOnly(EntityWrapper<AuctionDayInstanceCommentInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
