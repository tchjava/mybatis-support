package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.SubsidiesBalanceLog;

/**
 * <p>
 * 补贴余额日志表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-07-05
 */
public interface SubsidiesBalanceLogService extends IService<SubsidiesBalanceLog> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default SubsidiesBalanceLog getOnly(EntityWrapper<SubsidiesBalanceLog> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
