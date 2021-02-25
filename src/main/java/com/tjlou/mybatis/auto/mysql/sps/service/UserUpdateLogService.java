package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.UserUpdateLog;

/**
 * <p>
 * 用户修改信息日志 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-06-12
 */
public interface UserUpdateLogService extends IService<UserUpdateLog> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default UserUpdateLog getOnly(EntityWrapper<UserUpdateLog> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
