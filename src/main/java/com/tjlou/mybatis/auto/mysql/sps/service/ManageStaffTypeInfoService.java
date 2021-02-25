package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.ManageStaffTypeInfo;

/**
 * <p>
 * 身份类型信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2019-08-07
 */
public interface ManageStaffTypeInfoService extends IService<ManageStaffTypeInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default ManageStaffTypeInfo getOnly(EntityWrapper<ManageStaffTypeInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
