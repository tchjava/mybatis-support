package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.CollectInfo;

/**
 * <p>
 * 收藏店铺信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2019-08-04
 */
public interface CollectInfoService extends IService<CollectInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default CollectInfo getOnly(EntityWrapper<CollectInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
