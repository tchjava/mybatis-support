package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionCategoryWarrantInfo;

/**
 * <p>
 * 分类保证金配置表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-10-27
 */
public interface AuctionCategoryWarrantInfoService extends IService<AuctionCategoryWarrantInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionCategoryWarrantInfo getOnly(EntityWrapper<AuctionCategoryWarrantInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
