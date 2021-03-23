package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.UserAgentInfo;

/**
 * <p>
 * 推荐人信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-03-05
 */
public interface UserAgentInfoService extends IService<UserAgentInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default UserAgentInfo getOnly(Wrapper<UserAgentInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
