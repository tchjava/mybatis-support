package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.StoreRequestLogInfo;

/**
 * <p>
 * 请求日志信息表(新) 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-08-27
 */
public interface StoreRequestLogInfoService extends IService<StoreRequestLogInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default StoreRequestLogInfo getOnly(EntityWrapper<StoreRequestLogInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
