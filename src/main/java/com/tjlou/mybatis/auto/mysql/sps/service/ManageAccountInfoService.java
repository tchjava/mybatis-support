package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.ManageAccountInfo;

/**
 * <p>
 * 后台帐号信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-01-10
 */
public interface ManageAccountInfoService extends IService<ManageAccountInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default ManageAccountInfo getOnly(EntityWrapper<ManageAccountInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
