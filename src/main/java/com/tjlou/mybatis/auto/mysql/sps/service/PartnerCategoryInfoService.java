package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.PartnerCategoryInfo;

/**
 * <p>
 * 品类合伙人信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-05-09
 */
public interface PartnerCategoryInfoService extends IService<PartnerCategoryInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default PartnerCategoryInfo getOnly(EntityWrapper<PartnerCategoryInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
