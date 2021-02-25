package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.InsideShopInfo;

/**
 * <p>
 * 内部店铺信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-08-10
 */
public interface InsideShopInfoService extends IService<InsideShopInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default InsideShopInfo getOnly(EntityWrapper<InsideShopInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
