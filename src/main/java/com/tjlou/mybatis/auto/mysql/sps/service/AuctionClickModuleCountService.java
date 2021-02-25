package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionClickModuleCount;

/**
 * <p>
 * 拍卖-点击模块统计表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-11-03
 */
public interface AuctionClickModuleCountService extends IService<AuctionClickModuleCount> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionClickModuleCount getOnly(EntityWrapper<AuctionClickModuleCount> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
