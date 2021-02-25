package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionClickCategoryCount;

/**
 * <p>
 * 拍卖-点击分类统计 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-11-04
 */
public interface AuctionClickCategoryCountService extends IService<AuctionClickCategoryCount> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionClickCategoryCount getOnly(EntityWrapper<AuctionClickCategoryCount> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
