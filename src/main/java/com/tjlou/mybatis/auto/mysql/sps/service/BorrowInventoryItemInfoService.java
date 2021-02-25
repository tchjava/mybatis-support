package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.BorrowInventoryItemInfo;

/**
 * <p>
 * 借货清单明细表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-04-29
 */
public interface BorrowInventoryItemInfoService extends IService<BorrowInventoryItemInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default BorrowInventoryItemInfo getOnly(EntityWrapper<BorrowInventoryItemInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
