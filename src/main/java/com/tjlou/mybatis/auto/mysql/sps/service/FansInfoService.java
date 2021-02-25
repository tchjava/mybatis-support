package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.FansInfo;

/**
 * <p>
 * 粉丝基本信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2019-08-01
 */
public interface FansInfoService extends IService<FansInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default FansInfo getOnly(EntityWrapper<FansInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
