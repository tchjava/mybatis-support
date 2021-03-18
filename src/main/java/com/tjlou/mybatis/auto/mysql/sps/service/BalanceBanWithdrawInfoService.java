package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.BalanceBanWithdrawInfo;

/**
 * <p>
 * 余额禁止提现黑名单 服务类
 * </p>
 *
 * @author Gaby
 * @since 2021-03-12
 */
public interface BalanceBanWithdrawInfoService extends IService<BalanceBanWithdrawInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default BalanceBanWithdrawInfo getOnly(Wrapper<BalanceBanWithdrawInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
