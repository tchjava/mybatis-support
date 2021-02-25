package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.PrizeGoodsCommentInfo;

/**
 * <p>
 * 抽奖评价表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2019-11-26
 */
public interface PrizeGoodsCommentInfoService extends IService<PrizeGoodsCommentInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default PrizeGoodsCommentInfo getOnly(EntityWrapper<PrizeGoodsCommentInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
