package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.CustomParamsInfo;

/**
 * <p>
 * 自定义参数置换表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-08-10
 */
public interface CustomParamsInfoService extends IService<CustomParamsInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default CustomParamsInfo getOnly(EntityWrapper<CustomParamsInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
