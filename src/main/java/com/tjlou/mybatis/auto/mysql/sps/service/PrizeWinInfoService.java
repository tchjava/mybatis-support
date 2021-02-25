package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.PrizeWinInfo;

/**
 * <p>
 * 中奖信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2019-09-15
 */
public interface PrizeWinInfoService extends IService<PrizeWinInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default PrizeWinInfo getOnly(EntityWrapper<PrizeWinInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
