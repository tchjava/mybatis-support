package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.GoodsExtCountInfo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-07-30
 */
public interface GoodsExtCountInfoService extends IService<GoodsExtCountInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default GoodsExtCountInfo getOnly(EntityWrapper<GoodsExtCountInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
