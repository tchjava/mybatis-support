package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionClickModuleLog;

/**
 * <p>
 * 拍卖-点击模块记录表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-11-03
 */
public interface AuctionClickModuleLogService extends IService<AuctionClickModuleLog> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionClickModuleLog getOnly(EntityWrapper<AuctionClickModuleLog> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
