package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.BillBalanceWithdrawInfo;

/**
 * <p>
 * 余额提现信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2019-07-22
 */
public interface BillBalanceWithdrawInfoService extends IService<BillBalanceWithdrawInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default BillBalanceWithdrawInfo getOnly(EntityWrapper<BillBalanceWithdrawInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
