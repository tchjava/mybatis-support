package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.PartnerSetAgentLog;

/**
 * <p>
 * 合伙人设置代理日志表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-05-11
 */
public interface PartnerSetAgentLogService extends IService<PartnerSetAgentLog> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default PartnerSetAgentLog getOnly(EntityWrapper<PartnerSetAgentLog> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
