package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.ScoreLog;

/**
 * <p>
 * 积分日志表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2019-08-05
 */
public interface ScoreLogService extends IService<ScoreLog> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default ScoreLog getOnly(EntityWrapper<ScoreLog> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
