package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.tjlou.mybatis.auto.mysql.sps.entity.AddressInfo;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 地址信息表
 服务类
 * </p>
 *
 * @author Gaby
 * @since 2019-11-28
 */
public interface AddressInfoService extends IService<AddressInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AddressInfo getOnly(EntityWrapper<AddressInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
