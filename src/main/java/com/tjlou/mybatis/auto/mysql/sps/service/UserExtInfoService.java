package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.UserExtInfo;

/**
 * <p>
 * 用户信息扩展表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-01-15
 */
public interface UserExtInfoService extends IService<UserExtInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default UserExtInfo getOnly(Wrapper<UserExtInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
