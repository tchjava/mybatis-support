package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.IpWhiteInfo;

/**
 * <p>
 * ip白名单 服务类
 * </p>
 *
 * @author Gaby
 * @since 2021-01-25
 */
public interface IpWhiteInfoService extends IService<IpWhiteInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default IpWhiteInfo getOnly(EntityWrapper<IpWhiteInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
