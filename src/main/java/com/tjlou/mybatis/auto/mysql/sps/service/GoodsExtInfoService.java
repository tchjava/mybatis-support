package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.GoodsExtInfo;

/**
 * <p>
 * 商品扩展信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-05-22
 */
public interface GoodsExtInfoService extends IService<GoodsExtInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default GoodsExtInfo getOnly(EntityWrapper<GoodsExtInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
