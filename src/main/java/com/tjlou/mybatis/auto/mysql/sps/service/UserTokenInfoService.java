package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.UserTokenInfo;

/**
 * <p>
 * 用户登录token信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-12-21
 */
public interface UserTokenInfoService extends IService<UserTokenInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default UserTokenInfo getOnly(Wrapper<UserTokenInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
