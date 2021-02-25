package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.PartnerInfo;

/**
 * <p>
 * 合伙人信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-03-09
 */
public interface PartnerInfoService extends IService<PartnerInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default PartnerInfo getOnly(EntityWrapper<PartnerInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
