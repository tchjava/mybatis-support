package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.FreightChooseInfo;

/**
 * <p>
 * 运费选择信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-01-28
 */
public interface FreightChooseInfoService extends IService<FreightChooseInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default FreightChooseInfo getOnly(EntityWrapper<FreightChooseInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
