package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.UserWarrantLog;

/**
 * <p>
 * 拍卖-用户消保金日志 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-10-17
 */
public interface UserWarrantLogService extends IService<UserWarrantLog> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default UserWarrantLog getOnly(Wrapper<UserWarrantLog> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
