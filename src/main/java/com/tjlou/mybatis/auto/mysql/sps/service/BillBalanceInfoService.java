package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.BillBalanceInfo;

/**
 * <p>
 * 余额信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2019-07-25
 */
public interface BillBalanceInfoService extends IService<BillBalanceInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default BillBalanceInfo getOnly(EntityWrapper<BillBalanceInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
