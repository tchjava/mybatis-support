package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.PlatformSettingInfo;

/**
 * <p>
 * 平台参数设置信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2019-09-25
 */
public interface PlatformSettingInfoService extends IService<PlatformSettingInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default PlatformSettingInfo getOnly(EntityWrapper<PlatformSettingInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
