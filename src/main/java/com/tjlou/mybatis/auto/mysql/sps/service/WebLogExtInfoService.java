package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.WebLogExtInfo;

/**
 * <p>
 * 请求日志拓展信息表(公众号) 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-09-10
 */
public interface WebLogExtInfoService extends IService<WebLogExtInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default WebLogExtInfo getOnly(EntityWrapper<WebLogExtInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
