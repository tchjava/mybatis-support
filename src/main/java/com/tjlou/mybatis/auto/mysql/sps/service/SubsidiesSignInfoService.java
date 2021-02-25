package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.SubsidiesSignInfo;

/**
 * <p>
 * 补贴签到信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-07-05
 */
public interface SubsidiesSignInfoService extends IService<SubsidiesSignInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default SubsidiesSignInfo getOnly(EntityWrapper<SubsidiesSignInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
