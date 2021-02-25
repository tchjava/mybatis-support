package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.PlatformInfo;

/**
 * <p>
 * 平台信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2019-11-22
 */
public interface PlatformInfoService extends IService<PlatformInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default PlatformInfo getOnly(EntityWrapper<PlatformInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
