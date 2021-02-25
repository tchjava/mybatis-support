package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.PartnerBalanceLog;

/**
 * <p>
 * 合伙人-余额日志表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-03-05
 */
public interface PartnerBalanceLogService extends IService<PartnerBalanceLog> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default PartnerBalanceLog getOnly(EntityWrapper<PartnerBalanceLog> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
