package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.StrategyCategoryInfo;

/**
 * <p>
 * 攻略分类表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-07-12
 */
public interface StrategyCategoryInfoService extends IService<StrategyCategoryInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default StrategyCategoryInfo getOnly(EntityWrapper<StrategyCategoryInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
