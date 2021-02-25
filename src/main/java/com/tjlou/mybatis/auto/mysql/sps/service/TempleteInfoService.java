package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.TempleteInfo;

/**
 * <p>
 * 模板信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-05-15
 */
public interface TempleteInfoService extends IService<TempleteInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default TempleteInfo getOnly(EntityWrapper<TempleteInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
