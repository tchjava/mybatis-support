package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.ApplyAgentInfo;

/**
 * <p>
 * 申请代理信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2019-12-30
 */
public interface ApplyAgentInfoService extends IService<ApplyAgentInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default ApplyAgentInfo getOnly(EntityWrapper<ApplyAgentInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
