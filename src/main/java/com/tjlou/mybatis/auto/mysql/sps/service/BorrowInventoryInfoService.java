package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.BorrowInventoryInfo;

/**
 * <p>
 * 直播借货清单信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-04-28
 */
public interface BorrowInventoryInfoService extends IService<BorrowInventoryInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default BorrowInventoryInfo getOnly(EntityWrapper<BorrowInventoryInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
