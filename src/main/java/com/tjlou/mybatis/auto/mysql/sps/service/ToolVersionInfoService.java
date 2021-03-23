package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.ToolVersionInfo;

/**
 * <p>
 * 客户端版本信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2019-11-24
 */
public interface ToolVersionInfoService extends IService<ToolVersionInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default ToolVersionInfo getOnly(Wrapper<ToolVersionInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
