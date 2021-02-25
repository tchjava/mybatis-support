package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.ManagePermissionStaffRela;

/**
 * <p>
 * 权限角色关联表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2019-08-07
 */
public interface ManagePermissionStaffRelaService extends IService<ManagePermissionStaffRela> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default ManagePermissionStaffRela getOnly(EntityWrapper<ManagePermissionStaffRela> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
