package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.BillRechargeInfo;

/**
 * <p>
 * 充值信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2019-07-23
 */
public interface BillRechargeInfoService extends IService<BillRechargeInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default BillRechargeInfo getOnly(EntityWrapper<BillRechargeInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
