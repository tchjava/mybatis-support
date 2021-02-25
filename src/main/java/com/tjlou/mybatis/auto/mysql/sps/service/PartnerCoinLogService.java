package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.PartnerCoinLog;

/**
 * <p>
 * 合伙人-金币明细表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-03-05
 */
public interface PartnerCoinLogService extends IService<PartnerCoinLog> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default PartnerCoinLog getOnly(EntityWrapper<PartnerCoinLog> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
