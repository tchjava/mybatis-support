package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.ProtocolInfo;

/**
 * <p>
 * 协议内容信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2019-08-17
 */
public interface ProtocolInfoService extends IService<ProtocolInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default ProtocolInfo getOnly(EntityWrapper<ProtocolInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
