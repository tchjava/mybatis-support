package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.ManageUserStaffInfo;

/**
 * <p>
 * 用户身份信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2019-08-07
 */
public interface ManageUserStaffInfoService extends IService<ManageUserStaffInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default ManageUserStaffInfo getOnly(EntityWrapper<ManageUserStaffInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
