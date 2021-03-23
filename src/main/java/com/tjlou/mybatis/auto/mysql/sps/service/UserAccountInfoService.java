package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.UserAccountInfo;

/**
 * <p>
 * 平台用户表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-06-21
 */
public interface UserAccountInfoService extends IService<UserAccountInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default UserAccountInfo getOnly(Wrapper<UserAccountInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
