package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.RequestLogExtInfo;

/**
 * <p>
 * 请求日志拓展信息表(新) 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-05-13
 */
public interface RequestLogExtInfoService extends IService<RequestLogExtInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default RequestLogExtInfo getOnly(EntityWrapper<RequestLogExtInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
