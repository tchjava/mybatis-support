package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.BillCoinInfo;

/**
 * <p>
 * 库币信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2019-08-08
 */
public interface BillCoinInfoService extends IService<BillCoinInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default BillCoinInfo getOnly(EntityWrapper<BillCoinInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
