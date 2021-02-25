package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.UserWarrantInfo;

/**
 * <p>
 * 拍卖-用户消保金 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-10-23
 */
public interface UserWarrantInfoService extends IService<UserWarrantInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default UserWarrantInfo getOnly(EntityWrapper<UserWarrantInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
