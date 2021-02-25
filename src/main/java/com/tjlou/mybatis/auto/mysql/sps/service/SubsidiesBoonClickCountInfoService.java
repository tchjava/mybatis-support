package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.SubsidiesBoonClickCountInfo;

/**
 * <p>
 * 新人福利点击记录统计表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-10-07
 */
public interface SubsidiesBoonClickCountInfoService extends IService<SubsidiesBoonClickCountInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default SubsidiesBoonClickCountInfo getOnly(EntityWrapper<SubsidiesBoonClickCountInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
