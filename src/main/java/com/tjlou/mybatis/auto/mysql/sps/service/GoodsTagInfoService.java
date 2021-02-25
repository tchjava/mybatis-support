package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.GoodsTagInfo;

/**
 * <p>
 * 商品标签信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2019-08-09
 */
public interface GoodsTagInfoService extends IService<GoodsTagInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default GoodsTagInfo getOnly(EntityWrapper<GoodsTagInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
