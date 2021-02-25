package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.WxSettingInfo;

/**
 * <p>
 * 微信配置信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-05-30
 */
public interface WxSettingInfoService extends IService<WxSettingInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default WxSettingInfo getOnly(EntityWrapper<WxSettingInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
