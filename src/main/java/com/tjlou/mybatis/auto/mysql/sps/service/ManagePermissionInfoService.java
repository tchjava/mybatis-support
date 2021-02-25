package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.ManagePermissionInfo;

/**
 * <p>
 * 权限信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-05-27
 */
public interface ManagePermissionInfoService extends IService<ManagePermissionInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default ManagePermissionInfo getOnly(EntityWrapper<ManagePermissionInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
