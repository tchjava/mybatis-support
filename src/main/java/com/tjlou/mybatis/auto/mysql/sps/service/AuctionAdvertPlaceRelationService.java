package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionAdvertPlaceRelation;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-10-29
 */
public interface AuctionAdvertPlaceRelationService extends IService<AuctionAdvertPlaceRelation> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionAdvertPlaceRelation getOnly(EntityWrapper<AuctionAdvertPlaceRelation> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
