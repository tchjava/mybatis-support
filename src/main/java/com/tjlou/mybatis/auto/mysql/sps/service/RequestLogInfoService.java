package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.RequestLogInfo;

/**
 * <p>
 * 请求日志信息表(新) 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-05-13
 */
public interface RequestLogInfoService extends IService<RequestLogInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default RequestLogInfo getOnly(EntityWrapper<RequestLogInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
