package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.SubsidiesBoonClickLog;

/**
 * <p>
 * 拍卖百亿补贴福利用户点击记录表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-09-24
 */
public interface SubsidiesBoonClickLogService extends IService<SubsidiesBoonClickLog> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default SubsidiesBoonClickLog getOnly(EntityWrapper<SubsidiesBoonClickLog> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
