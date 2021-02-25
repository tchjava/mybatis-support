package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.DrawInfo;

/**
 * <p>
 * 抽点信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2019-07-17
 */
public interface DrawInfoService extends IService<DrawInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default DrawInfo getOnly(EntityWrapper<DrawInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
