package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.IdCardWhiteInfo;

/**
 * <p>
 * 身份证白名单 服务类
 * </p>
 *
 * @author Gaby
 * @since 2021-01-09
 */
public interface IdCardWhiteInfoService extends IService<IdCardWhiteInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default IdCardWhiteInfo getOnly(EntityWrapper<IdCardWhiteInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
