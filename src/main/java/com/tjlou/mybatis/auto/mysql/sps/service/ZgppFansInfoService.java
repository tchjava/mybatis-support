package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.ZgppFansInfo;

/**
 * <p>
 * 诸葛拍拍粉丝信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2021-01-08
 */
public interface ZgppFansInfoService extends IService<ZgppFansInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default ZgppFansInfo getOnly(Wrapper<ZgppFansInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
