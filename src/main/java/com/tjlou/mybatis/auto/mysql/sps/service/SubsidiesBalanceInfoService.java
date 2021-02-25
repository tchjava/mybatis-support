package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.SubsidiesBalanceInfo;

/**
 * <p>
 * 补贴余额信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-07-05
 */
public interface SubsidiesBalanceInfoService extends IService<SubsidiesBalanceInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default SubsidiesBalanceInfo getOnly(EntityWrapper<SubsidiesBalanceInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
