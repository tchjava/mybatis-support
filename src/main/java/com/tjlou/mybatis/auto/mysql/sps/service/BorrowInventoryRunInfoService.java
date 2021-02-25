package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.BorrowInventoryRunInfo;

/**
 * <p>
 * 清单正在入库实例表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-05-23
 */
public interface BorrowInventoryRunInfoService extends IService<BorrowInventoryRunInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default BorrowInventoryRunInfo getOnly(EntityWrapper<BorrowInventoryRunInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
