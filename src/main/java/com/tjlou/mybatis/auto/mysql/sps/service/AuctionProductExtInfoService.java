package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionProductExtInfo;

/**
 * <p>
 * 拍品拓展信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-06-03
 */
public interface AuctionProductExtInfoService extends IService<AuctionProductExtInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionProductExtInfo getOnly(EntityWrapper<AuctionProductExtInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
