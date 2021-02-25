package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.BillCoinTaskInstance;

/**
 * <p>
 * 金币任务实例表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2019-08-29
 */
public interface BillCoinTaskInstanceService extends IService<BillCoinTaskInstance> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default BillCoinTaskInstance getOnly(EntityWrapper<BillCoinTaskInstance> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
