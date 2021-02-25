package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.UserWarrantSuccess;

/**
 * <p>
 * 拍卖-保证金缴纳成功记录表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-06-10
 */
public interface UserWarrantSuccessService extends IService<UserWarrantSuccess> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default UserWarrantSuccess getOnly(EntityWrapper<UserWarrantSuccess> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
