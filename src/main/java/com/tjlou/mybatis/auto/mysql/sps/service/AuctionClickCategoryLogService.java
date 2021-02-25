package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionClickCategoryLog;

/**
 * <p>
 * 拍卖-点击分类记录表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-11-04
 */
public interface AuctionClickCategoryLogService extends IService<AuctionClickCategoryLog> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionClickCategoryLog getOnly(EntityWrapper<AuctionClickCategoryLog> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
