package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.BillBalanceLog;

/**
 * <p>
 * 余额日志表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2019-07-25
 */
public interface BillBalanceLogService extends IService<BillBalanceLog> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default BillBalanceLog getOnly(EntityWrapper<BillBalanceLog> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
