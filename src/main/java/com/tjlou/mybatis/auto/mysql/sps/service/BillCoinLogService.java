package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.BillCoinLog;

/**
 * <p>
 * 库币变动日志表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2019-08-08
 */
public interface BillCoinLogService extends IService<BillCoinLog> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default BillCoinLog getOnly(EntityWrapper<BillCoinLog> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
