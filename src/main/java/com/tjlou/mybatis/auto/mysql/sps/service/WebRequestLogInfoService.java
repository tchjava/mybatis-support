package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.WebRequestLogInfo;

/**
 * <p>
 * 请求日志信息表(公众号) 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-09-10
 */
public interface WebRequestLogInfoService extends IService<WebRequestLogInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default WebRequestLogInfo getOnly(Wrapper<WebRequestLogInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
