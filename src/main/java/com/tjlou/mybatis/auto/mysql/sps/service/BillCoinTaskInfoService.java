package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.BillCoinTaskInfo;

/**
 * <p>
 * 金币任务信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2019-08-29
 */
public interface BillCoinTaskInfoService extends IService<BillCoinTaskInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default BillCoinTaskInfo getOnly(EntityWrapper<BillCoinTaskInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
