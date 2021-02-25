package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.CustomServiceInfo;

/**
 * <p>
 * 客服信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-07-19
 */
public interface CustomServiceInfoService extends IService<CustomServiceInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default CustomServiceInfo getOnly(EntityWrapper<CustomServiceInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
