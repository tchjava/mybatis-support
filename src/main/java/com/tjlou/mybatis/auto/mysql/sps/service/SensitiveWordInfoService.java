package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.SensitiveWordInfo;

/**
 * <p>
 * 敏感词汇信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-03-27
 */
public interface SensitiveWordInfoService extends IService<SensitiveWordInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default SensitiveWordInfo getOnly(EntityWrapper<SensitiveWordInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
