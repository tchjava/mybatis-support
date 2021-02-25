package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.UserActionInfo;

/**
 * <p>
 * 用户行为记录表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2019-09-17
 */
public interface UserActionInfoService extends IService<UserActionInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default UserActionInfo getOnly(EntityWrapper<UserActionInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
