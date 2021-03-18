package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.UserWxGrantInfo;

/**
 * <p>
 * 用户微信授权信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-12-21
 */
public interface UserWxGrantInfoService extends IService<UserWxGrantInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default UserWxGrantInfo getOnly(Wrapper<UserWxGrantInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
