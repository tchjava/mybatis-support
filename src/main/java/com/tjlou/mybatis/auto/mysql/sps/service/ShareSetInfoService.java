package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.ShareSetInfo;

/**
 * <p>
 * 分享设置表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-02-05
 */
public interface ShareSetInfoService extends IService<ShareSetInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default ShareSetInfo getOnly(EntityWrapper<ShareSetInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
