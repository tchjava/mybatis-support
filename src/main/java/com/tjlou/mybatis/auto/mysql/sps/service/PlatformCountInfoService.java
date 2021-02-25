package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.PlatformCountInfo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-07-30
 */
public interface PlatformCountInfoService extends IService<PlatformCountInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default PlatformCountInfo getOnly(EntityWrapper<PlatformCountInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
