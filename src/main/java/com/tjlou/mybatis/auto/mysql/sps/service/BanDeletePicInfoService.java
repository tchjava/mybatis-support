package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.BanDeletePicInfo;

/**
 * <p>
 * 不可删除图片信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-05-22
 */
public interface BanDeletePicInfoService extends IService<BanDeletePicInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default BanDeletePicInfo getOnly(EntityWrapper<BanDeletePicInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
