package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.ShareQrcodeInfo;

/**
 * <p>
 * 分享二维码信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2019-09-18
 */
public interface ShareQrcodeInfoService extends IService<ShareQrcodeInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default ShareQrcodeInfo getOnly(EntityWrapper<ShareQrcodeInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
