package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.ThresholdInfo;

/**
 * <p>
 * 阈值信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-03-13
 */
public interface ThresholdInfoService extends IService<ThresholdInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default ThresholdInfo getOnly(EntityWrapper<ThresholdInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
