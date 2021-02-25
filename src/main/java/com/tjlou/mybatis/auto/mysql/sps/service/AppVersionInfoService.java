package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AppVersionInfo;

/**
 * <p>
 * app版本信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2019-12-12
 */
public interface AppVersionInfoService extends IService<AppVersionInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AppVersionInfo getOnly(EntityWrapper<AppVersionInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
