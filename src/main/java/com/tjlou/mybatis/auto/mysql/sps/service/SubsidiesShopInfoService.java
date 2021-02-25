package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.SubsidiesShopInfo;

/**
 * <p>
 * 补贴店铺表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-07-05
 */
public interface SubsidiesShopInfoService extends IService<SubsidiesShopInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default SubsidiesShopInfo getOnly(EntityWrapper<SubsidiesShopInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
