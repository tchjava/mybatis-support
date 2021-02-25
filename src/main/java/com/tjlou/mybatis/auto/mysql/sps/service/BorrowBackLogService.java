package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.BorrowBackLog;

/**
 * <p>
 * 借货清单退回记录 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-04-29
 */
public interface BorrowBackLogService extends IService<BorrowBackLog> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default BorrowBackLog getOnly(EntityWrapper<BorrowBackLog> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
