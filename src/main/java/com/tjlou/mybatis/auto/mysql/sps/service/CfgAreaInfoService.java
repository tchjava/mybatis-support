package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.CfgAreaInfo;

/**
 * <p>
 * 行政区划表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2019-06-20
 */
public interface CfgAreaInfoService extends IService<CfgAreaInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default CfgAreaInfo getOnly(EntityWrapper<CfgAreaInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
