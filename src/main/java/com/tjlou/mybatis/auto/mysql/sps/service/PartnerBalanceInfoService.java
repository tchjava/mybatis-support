package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.PartnerBalanceInfo;

/**
 * <p>
 * 合伙人-余额信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-03-05
 */
public interface PartnerBalanceInfoService extends IService<PartnerBalanceInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default PartnerBalanceInfo getOnly(EntityWrapper<PartnerBalanceInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
