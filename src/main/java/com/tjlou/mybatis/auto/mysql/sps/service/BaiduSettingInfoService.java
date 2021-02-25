package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.BaiduSettingInfo;

/**
 * <p>
 * 百度设置信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-12-07
 */
public interface BaiduSettingInfoService extends IService<BaiduSettingInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default BaiduSettingInfo getOnly(EntityWrapper<BaiduSettingInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
