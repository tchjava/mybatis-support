package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.PartnerCoinInfo;

/**
 * <p>
 * 合伙人金币信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-03-05
 */
public interface PartnerCoinInfoService extends IService<PartnerCoinInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default PartnerCoinInfo getOnly(EntityWrapper<PartnerCoinInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
