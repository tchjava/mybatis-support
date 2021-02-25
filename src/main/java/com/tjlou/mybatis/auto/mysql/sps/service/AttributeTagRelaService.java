package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AttributeTagRela;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Gaby
 * @since 2019-08-10
 */
public interface AttributeTagRelaService extends IService<AttributeTagRela> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AttributeTagRela getOnly(EntityWrapper<AttributeTagRela> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
