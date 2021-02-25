package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.CallCardInfo;

/**
 * <p>
 * 名片信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-02-14
 */
public interface CallCardInfoService extends IService<CallCardInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default CallCardInfo getOnly(EntityWrapper<CallCardInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
