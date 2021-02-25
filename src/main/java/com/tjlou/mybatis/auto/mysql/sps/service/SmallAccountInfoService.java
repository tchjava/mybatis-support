package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.SmallAccountInfo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-08-03
 */
public interface SmallAccountInfoService extends IService<SmallAccountInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default SmallAccountInfo getOnly(EntityWrapper<SmallAccountInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
