package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionClickCategoryExpandCount;

/**
 * <p>
 * 拍卖-点击分类拓展统计 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-11-03
 */
public interface AuctionClickCategoryExpandCountService extends IService<AuctionClickCategoryExpandCount> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionClickCategoryExpandCount getOnly(EntityWrapper<AuctionClickCategoryExpandCount> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
