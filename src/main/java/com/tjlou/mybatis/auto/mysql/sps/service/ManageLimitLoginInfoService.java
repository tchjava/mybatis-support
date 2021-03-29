package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.tjlou.mybatis.auto.mysql.sps.entity.ManageLimitLoginInfo;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 后台限制登录信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2021-03-29
 */
public interface ManageLimitLoginInfoService extends IService<ManageLimitLoginInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default ManageLimitLoginInfo getOnly(Wrapper<ManageLimitLoginInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
