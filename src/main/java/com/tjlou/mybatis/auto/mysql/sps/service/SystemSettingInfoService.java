package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.SystemSettingInfo;

/**
 * <p>
 * 系统设置信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-06-16
 */
public interface SystemSettingInfoService extends IService<SystemSettingInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default SystemSettingInfo getOnly(EntityWrapper<SystemSettingInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
