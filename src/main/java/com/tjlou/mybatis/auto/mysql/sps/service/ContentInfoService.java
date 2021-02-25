package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.ContentInfo;

/**
 * <p>
 * 广告信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-01-11
 */
public interface ContentInfoService extends IService<ContentInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default ContentInfo getOnly(EntityWrapper<ContentInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
