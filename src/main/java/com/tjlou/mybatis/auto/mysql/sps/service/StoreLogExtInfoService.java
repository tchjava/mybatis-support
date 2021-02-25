package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.StoreLogExtInfo;

/**
 * <p>
 * 请求日志拓展信息表(新) 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-09-10
 */
public interface StoreLogExtInfoService extends IService<StoreLogExtInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default StoreLogExtInfo getOnly(EntityWrapper<StoreLogExtInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
